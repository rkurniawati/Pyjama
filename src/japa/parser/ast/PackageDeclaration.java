/*
 * Copyright (C) 2007 J�lio Vilmar Gesser.
 * 
 * This file is part of Java 1.5 parser and Abstract Syntax Tree.
 *
 * Java 1.5 parser and Abstract Syntax Tree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Java 1.5 parser and Abstract Syntax Tree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java 1.5 parser and Abstract Syntax Tree.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 17/10/2007
 */
package japa.parser.ast;

import japa.parser.ast.expr.NameExpr;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

import java.util.List;

/**
 * <p>
 * This class represents the package declaration. The package declaration is
 * optional for the {@link CompilationUnit}.
 * </p>
 * The PackageDeclaration is constructed following the syntax:<br>
 * <code>
 * <table>
 * <tr valign=baseline>
 *   <td align=right>PackageDeclaration</td>
 *   <td align=center>::=</td>
 *   <td align=left>
 *       ( {@link AnnotationExpr} )* "package" {@link NameExpr} ) ";"
 *   </td>
 * </tr>
 * </table> 
 * </code>
 * 
 * @author Julio Vilmar Gesser
 */
public final class PackageDeclaration extends Node {

    private List<PackageModifier> modifiers;

    private List<Identifier> identifiers;
    
    private String name;

    public PackageDeclaration() {
    }

    public PackageDeclaration(List<Identifier> identifiers) {
    	this.setIdentifiers(identifiers);
    }

    public PackageDeclaration(List<PackageModifier> modifiers, List<Identifier> identifiers) {
        this.setModifiers(modifiers);
        this.setIdentifiers(identifiers);
    }

    public PackageDeclaration(int beginLine, int beginColumn, int endLine, int endColumn, List<PackageModifier> modifiers, List<Identifier> identifiers) {
        super(beginLine, beginColumn, endLine, endColumn);
        this.setModifiers(modifiers);
        this.setIdentifiers(identifiers);
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PackageModifier> getModifiers() {
		return modifiers;
	}

	public void setModifiers(List<PackageModifier> modifiers) {
		this.modifiers = modifiers;
	}

	public List<Identifier> getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(List<Identifier> identifiers) {
		this.identifiers = identifiers;
	}

}
