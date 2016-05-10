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

import javax.swing.SwingUtilities;

public class SingleThreadVirtualTarget extends VirtualTarget{
	private Thread thread;
	
	public SingleThreadVirtualTarget(String targetName, Thread t) {
		this.targetName = targetName;
		this.thread = t;
	}
	@Override
	public void submit(final TargetTask<?> task) {
		// TODO need further implementation
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
		SwingUtilities.invokeLater(taskCode);
	}
	
	public Thread getThread() {
		return this.thread;
	}
	
	public String targetName() {
		return this.targetName;
	}

}
