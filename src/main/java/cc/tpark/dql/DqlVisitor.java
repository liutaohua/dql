// Generated from /Users/liudawei/allfiles/workspace/mapbar/wecloud-tfso/rule-engine/src/main/java/cc/tpark/dql/Dql.g4 by ANTLR 4.7.2
package cc.tpark.dql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(DqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link DqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(DqlParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(DqlParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DqlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecificationNointo(DqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DqlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(DqlParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DqlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElement(DqlParser.SelectElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(DqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DqlParser#tableSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSources(DqlParser.TableSourcesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code embbedExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbbedExpr(DqlParser.EmbbedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(DqlParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(DqlParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link DqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(DqlParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DqlParser#booleanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(DqlParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DqlParser#leftexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftexpr(DqlParser.LeftexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DqlParser.ValueContext ctx);
}