// Generated from /Users/liudawei/allfiles/workspace/mapbar/wecloud-tfso/rule-engine/src/main/java/cc/tpark/dql/Dql.g4 by ANTLR 4.7.2
package cc.tpark.dql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DqlParser}.
 */
public interface DqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(DqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(DqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(DqlParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(DqlParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(DqlParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(DqlParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecificationNointo(DqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecificationNointo(DqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(DqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(DqlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(DqlParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(DqlParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(DqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(DqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(DqlParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(DqlParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code embbedExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEmbbedExpr(DqlParser.EmbbedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code embbedExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEmbbedExpr(DqlParser.EmbbedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(DqlParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(DqlParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(DqlParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(DqlParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(DqlParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(DqlParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(DqlParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(DqlParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#leftexpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftexpr(DqlParser.LeftexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#leftexpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftexpr(DqlParser.LeftexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DqlParser.ValueContext ctx);
}