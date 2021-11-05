// Generated from /home/mohadeseh/Desktop/UT/Compiler/c--/src/com/plc/cmm/Cmm.g4 by ANTLR 4.9.2
package com.plc.cmm;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#func_dec}.
	 * @param ctx the parse tree
	 */
	void enterFunc_dec(CmmParser.Func_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#func_dec}.
	 * @param ctx the parse tree
	 */
	void exitFunc_dec(CmmParser.Func_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#struct_dec}.
	 * @param ctx the parse tree
	 */
	void enterStruct_dec(CmmParser.Struct_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#struct_dec}.
	 * @param ctx the parse tree
	 */
	void exitStruct_dec(CmmParser.Struct_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(CmmParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(CmmParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CmmParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CmmParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CmmParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CmmParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(CmmParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(CmmParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(CmmParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(CmmParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(CmmParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(CmmParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(CmmParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(CmmParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CmmParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CmmParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CmmParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CmmParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(CmmParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(CmmParser.IntegerContext ctx);
}