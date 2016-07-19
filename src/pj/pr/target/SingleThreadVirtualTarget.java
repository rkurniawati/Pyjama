/*
 * Copyright (C) 2013-2016 Parallel and Reconfigurable Computing Group, University of Auckland.
 *
 * Authors: <http://homepages.engineering.auckland.ac.nz/~parallel/ParallelIT/People.html>
 * 
 * This file is part of Pyjama, a Java implementation of OpenMP-like directive-based 
 * parallelisation compiler and its runtime routines.
 *
 * Pyjama is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Pyjama is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Pyjama. If not, see <http://www.gnu.org/licenses/>.
 */

package pj.pr.target;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import pj.PjRuntime;

public class SingleThreadVirtualTarget extends VirtualTarget{
	private Thread thread;
	
	public SingleThreadVirtualTarget(String targetName, Thread t) {
		this.targetName = targetName;
		this.thread = t;
	}
	@Override
	public void submit(final TargetTask<?> task) {
		/*
		 * We suppose this singleThreadVirtualTarget is swing edt,
		 * so using SwingUtilities.invokeLater to put this task at
		 * the end of EDT callback function queue.
		 */
		task.setCaller(this);
		Runnable taskCode = new Runnable() {
			@Override
			public void run() {
				task.run();
			}
		};
		switch(PjRuntime.getPlatform()) {
		case Swing:
			postToSwingEDT(taskCode);
			break;
		case Android:
			postToAndroidEDT(taskCode);
			break;
		case JavaFX:
			postToJavaFxEDT(taskCode);
			break;
		default:
			throw new RuntimeException("Unsupported platform for EDT task posting.");
		}
	}
	
	public Thread getThread() {
		return this.thread;
	}
	
	private void postToSwingEDT(Runnable taskCode) {
		try {
			Class<?> cls = Class.forName("javax.swing.SwingUtilities");
			Method postMethod = cls.getDeclaredMethod("invokeLater", java.lang.Runnable.class);
			postMethod.invoke(null, taskCode);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new RuntimeException("Pyjama: Cannot find proper posting method for Swing framework" + e.toString());
		}
	}
	
	private void postToAndroidEDT(Runnable taskCode) {
		try {
			Class<?> looperClass = Class.forName("android.os.Looper");
			Object mainLooper = looperClass.getDeclaredMethod("getMainLooper").invoke(null);
			Class<?> handlerClass = Class.forName("android.os.Handler");
			Constructor<?> handlerConstructor = handlerClass.getConstructor(looperClass);
			Object handlerInstance = handlerConstructor.newInstance(mainLooper);
			Method postMethod = handlerClass.getDeclaredMethod("post", java.lang.Runnable.class);
			postMethod.invoke(handlerInstance, taskCode);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			throw new RuntimeException("Pyjama: Cannot find proper posting method for Android framework:" + e.toString());
		}
	}
	
	private void postToJavaFxEDT(Runnable taskCode) {
		try {
			Class<?> cls = Class.forName("javafx.application.Platform");
			Method postMethod = cls.getDeclaredMethod("runLater", java.lang.Runnable.class);
			postMethod.invoke(null, taskCode);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new RuntimeException("Pyjama: Cannot find proper posting method for JavaFX framework" + e.toString());
		}
	}

}
