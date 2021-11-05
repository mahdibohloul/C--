// Generated from /home/mohadeseh/Desktop/UT/Compiler/c--/src/com/plc/cmm/Cmm.g4 by ANTLR 4.9.2
package com.plc.cmm;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#func_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_dec(CmmParser.Func_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#struct_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_dec(CmmParser.Struct_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_body(CmmParser.Struct_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#getter_setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter(CmmParser.Getter_setterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CmmParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(CmmParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(CmmParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay(CmmParser.DisplayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assignstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstmt(CmmParser.AssignstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CmmParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CmmParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(CmmParser.IntegerContext ctx);
}