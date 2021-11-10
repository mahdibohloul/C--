// Generated from /home/mohadeseh/Desktop/UT/Compiler/c--/src/com/plc/cmm/Cmm.g4 by ANTLR 4.9.2
package com.plc.cmm;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 */
	void enterCmm(CmmParser.CmmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 */
	void exitCmm(CmmParser.CmmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(CmmParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(CmmParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(CmmParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(CmmParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#struct_scope}.
	 * @param ctx the parse tree
	 */
	void enterStruct_scope(CmmParser.Struct_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#struct_scope}.
	 * @param ctx the parse tree
	 */
	void exitStruct_scope(CmmParser.Struct_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#struct_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterStruct_var_dec(CmmParser.Struct_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#struct_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitStruct_var_dec(CmmParser.Struct_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#getter_setter}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter(CmmParser.Getter_setterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#getter_setter}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter(CmmParser.Getter_setterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(CmmParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(CmmParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CmmParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CmmParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(CmmParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(CmmParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#function_invoke}.
	 * @param ctx the parse tree
	 */
	void enterFunction_invoke(CmmParser.Function_invokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#function_invoke}.
	 * @param ctx the parse tree
	 */
	void exitFunction_invoke(CmmParser.Function_invokeContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CmmParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CmmParser.AssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#struct_accessor}.
	 * @param ctx the parse tree
	 */
	void enterStruct_accessor(CmmParser.Struct_accessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#struct_accessor}.
	 * @param ctx the parse tree
	 */
	void exitStruct_accessor(CmmParser.Struct_accessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(CmmParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(CmmParser.Return_statementContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CmmParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CmmParser.ArgumentContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#append_dec}.
	 * @param ctx the parse tree
	 */
	void enterAppend_dec(CmmParser.Append_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#append_dec}.
	 * @param ctx the parse tree
	 */
	void exitAppend_dec(CmmParser.Append_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#size_dec}.
	 * @param ctx the parse tree
	 */
	void enterSize_dec(CmmParser.Size_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#size_dec}.
	 * @param ctx the parse tree
	 */
	void exitSize_dec(CmmParser.Size_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#scope_body_with_return}.
	 * @param ctx the parse tree
	 */
	void enterScope_body_with_return(CmmParser.Scope_body_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#scope_body_with_return}.
	 * @param ctx the parse tree
	 */
	void exitScope_body_with_return(CmmParser.Scope_body_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#scope_body}.
	 * @param ctx the parse tree
	 */
	void enterScope_body(CmmParser.Scope_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#scope_body}.
	 * @param ctx the parse tree
	 */
	void exitScope_body(CmmParser.Scope_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#scope_body_one_line}.
	 * @param ctx the parse tree
	 */
	void enterScope_body_one_line(CmmParser.Scope_body_one_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#scope_body_one_line}.
	 * @param ctx the parse tree
	 */
	void exitScope_body_one_line(CmmParser.Scope_body_one_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#if_stament}.
	 * @param ctx the parse tree
	 */
	void enterIf_stament(CmmParser.If_stamentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#if_stament}.
	 * @param ctx the parse tree
	 */
	void exitIf_stament(CmmParser.If_stamentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#else_stament}.
	 * @param ctx the parse tree
	 */
	void enterElse_stament(CmmParser.Else_stamentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#else_stament}.
	 * @param ctx the parse tree
	 */
	void exitElse_stament(CmmParser.Else_stamentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CmmParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CmmParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(CmmParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(CmmParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(CmmParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(CmmParser.Do_while_statementContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link CmmParser#fptr_type}.
	 * @param ctx the parse tree
	 */
	void enterFptr_type(CmmParser.Fptr_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#fptr_type}.
	 * @param ctx the parse tree
	 */
	void exitFptr_type(CmmParser.Fptr_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#list_type}.
	 * @param ctx the parse tree
	 */
	void enterList_type(CmmParser.List_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#list_type}.
	 * @param ctx the parse tree
	 */
	void exitList_type(CmmParser.List_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#list_accessor}.
	 * @param ctx the parse tree
	 */
	void enterList_accessor(CmmParser.List_accessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#list_accessor}.
	 * @param ctx the parse tree
	 */
	void exitList_accessor(CmmParser.List_accessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#built_in_data_type}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in_data_type(CmmParser.Built_in_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#built_in_data_type}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in_data_type(CmmParser.Built_in_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(CmmParser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(CmmParser.KeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(CmmParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(CmmParser.Type_specifierContext ctx);
}