package japa;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class NodeLocationer {
	public int startLine;
	public int startColumn;
	public int endLine;
	public int endColumn;
	
	NodeLocationer(ParserRuleContext ctx) {
		Token startToken = ctx.getStart();
		Token endToken = ctx.getStop();
		this.startLine = startToken.getLine();
		this.startColumn = startToken.getStartIndex();
		this.endLine = endToken.getLine();
		this.endColumn = endToken.getStopIndex();
	}

}
