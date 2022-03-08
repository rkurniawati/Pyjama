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

package pj.parser.ast.omp;

import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

/**
 * This class defines the reduction operators. Below is the list of operators
 * and their init values as specified in OpenMP 2.5
 * 
 * + 0 * 1 - 0 & ~0 | 0 ^ 0 && 1 || 0
 * 
 * However, not all operations are valid in the object oriented context, where
 * the variable types are strongly defined. For more information, the Pyjama
 * paper should be referred.
 *
 * @author vikassingh
 * 
 */
public class OmpReductionOperator extends OpenMPStatement
{
	/*
	 * we support all an object oriented approach reduction. there are
	 * operations that are not defined in OpenMP 2.5, but they may be crucially
	 * important operations.
	 */
	public static enum Operator
	{
		Plus, Mult, Minus, BitAND, BitOR, BitXOR, LogAND, LogOR, Max, Min
	};

	private Operator primitiveOperator = null;
	private NameExpr userDefinedReduction = null;

	public OmpReductionOperator(Operator operator)
	{
		this.primitiveOperator = operator;
	}

	public OmpReductionOperator(NameExpr userDefinedReduction)
	{
		if (userDefinedReduction.toString().equals("min"))
			primitiveOperator = Operator.Min;
		else if (userDefinedReduction.toString().equals("max"))
			primitiveOperator = Operator.Max;
		else
			this.userDefinedReduction = userDefinedReduction;
	}

	public OmpReductionOperator(int beginLine, int beginColumn, int endLine, int endColumn, Operator operator)
	{
		super(beginLine, beginColumn, endLine, endColumn);
		this.primitiveOperator = operator;
	}

	public OmpReductionOperator(int beginLine, int beginColumn, int endLine, int endColumn,
			NameExpr userDefinedReduction)
	{
		super(beginLine, beginColumn, endLine, endColumn);
		this.userDefinedReduction = userDefinedReduction;
	}

	public NameExpr getUserDefinedReduction()
	{
		return userDefinedReduction;
	}

	public Operator getOperator()
	{
		return primitiveOperator;
	}

	public String getOperatorReductionString(String varName1, String varName2)
	{
		if (userDefinedReduction != null)
			return userDefinedReduction.toString();
		switch (primitiveOperator)
		{
		case Plus:
			return varName1 + " + " + varName2;
		case Minus:
			return varName1 + " + " + varName2;
		case Mult:
			return varName1 + " * " + varName2;
		case BitAND:
			return varName1 + " & " + varName2;
		case BitOR:
			return varName1 + " | " + varName2;
		case BitXOR:
			return varName1 + " ^ " + varName2;
		case LogAND:
			return varName1 + " && " + varName2;
		case LogOR:
			return varName1 + " || " + varName2;
		case Max:
			return varName1 + ">" + varName2 + "?" + varName1 + ":" + varName2;
		case Min:
			return varName1 + "<" + varName2 + "?" + varName1 + ":" + varName2;
		}
		throw new RuntimeException("Invalid reduction: " + primitiveOperator);
	}

	public String getOperatorIdentity(String varType)
	{
		String valStr = "";
		if (primitiveOperator == null)
			throw new RuntimeException("Invalid reduction operator: " + userDefinedReduction);
		switch (primitiveOperator)
		{
		case Plus:
			valStr = "0";
			break;
		case Mult:
			valStr = "1";
			break;
		case Minus:
			valStr = "0";
			break;
		case BitAND:
			valStr = "~0";
			break;
		case BitOR:
			valStr = "0";
			break;
		case BitXOR:
			valStr = "0";
			break;
		case LogAND:
			if (varType.equals("boolean") || varType.equals("Boolean"))
			{
				valStr = "true";
			}
			break;
		case LogOR:
			if (varType.equals("boolean") || varType.equals("Boolean"))
			{
				valStr = "false";
			}
			break;
		case Max:
			switch (varType)
			{
			case "int":
			case "Integer":
				valStr += Integer.MIN_VALUE;
				break;
			case "double":
			case "Double":
				valStr = "-1.0/0";
				break;
			case "long":
			case "Long":
				valStr += Long.MIN_VALUE;
				break;
			case "char":
			case "Character":
				valStr += Character.MIN_VALUE;
				break;
			case "byte":
			case "Byte":
				valStr += Byte.MIN_VALUE;
				break;
			case "short":
			case "Short":
				valStr += Short.MIN_VALUE;
				break;
			case "float":
			case "Float":
				valStr = "-1.0f/0";
				break;
			}
			break;
		case Min:
			switch (varType)
			{
			case "int":
			case "Integer":
				valStr += Integer.MAX_VALUE;
				break;
			case "double":
			case "Double":
				valStr = "1.0/0";
				break;
			case "long":
			case "Long":
				valStr += Long.MAX_VALUE;
				break;
			case "char":
			case "Character":
				valStr += Character.MAX_VALUE;
				break;
			case "byte":
			case "Byte":
				valStr += Byte.MAX_VALUE;
				break;
			case "short":
			case "Short":
				valStr += Short.MAX_VALUE;
				break;
			case "float":
			case "Float":
				valStr = "1.0f/0";
				break;
			}
			break;
		}


			if (varType.equals("double") || varType.equals("Double"))
				valStr += ".0d";
			else if (varType.equals("long") || varType.equals("Long"))
				valStr += "L";
			else if (varType.equals("float") || varType.equals("Float"))
				valStr += ".0f";
		return valStr;
	}

	@Override
	public <R, A> R accept(GenericVisitor<R, A> v, A arg)
	{
		return v.visit(this, arg);
	}

	@Override
	public <A> void accept(VoidVisitor<A> v, A arg)
	{
		v.visit(this, arg);
	}
}
