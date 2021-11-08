// Generated from /home/tapsi/codes/c--/src/com/plc/cmm/Cmm.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmm(CmmParser.CmmContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(CmmParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(CmmParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(CmmParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CmmParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(CmmParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#function_invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_invoke(CmmParser.Function_invokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CmmParser.AssignmentContext ctx);
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
	 * Visit a parse tree produced by {@link CmmParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(CmmParser.Return_statementContext ctx);
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
	 * Visit a parse tree produced by {@link CmmParser#display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay(CmmParser.DisplayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#append_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend_dec(CmmParser.Append_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#size_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize_dec(CmmParser.Size_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#struct_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_scope(CmmParser.Struct_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#struct_var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_var_dec(CmmParser.Struct_var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#getter_setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter(CmmParser.Getter_setterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#scope_body_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_body_with_return(CmmParser.Scope_body_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#scope_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_body(CmmParser.Scope_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#scope_body_one_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_body_one_line(CmmParser.Scope_body_one_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#if_stament}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stament(CmmParser.If_stamentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#else_stament}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stament(CmmParser.Else_stamentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CmmParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(CmmParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(CmmParser.Do_while_statementContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link CmmParser#fptr_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFptr_type(CmmParser.Fptr_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#list_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_type(CmmParser.List_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#built_in_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in_data_type(CmmParser.Built_in_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(CmmParser.Type_specifierContext ctx);
}