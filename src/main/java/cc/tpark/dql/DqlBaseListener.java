// Generated from /Users/liudawei/allfiles/workspace/mapbar/wecloud-tfso/rule-engine/src/main/java/cc/tpark/dql/Dql.g4 by ANTLR 4.7.2
package cc.tpark.dql;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * This class provides an empty implementation of {@link DqlListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class DqlBaseListener implements DqlListener {

    private Stack<Boolean> stack;
    private String fieldName;
    private Map<String, Object> data;
    private List<String> funcs;

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }


    public DqlBaseListener(Stack<Boolean> stack) {
        this.stack = stack;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterRoot(DqlParser.RootContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitRoot(DqlParser.RootContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSqlStatements(DqlParser.SqlStatementsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSqlStatements(DqlParser.SqlStatementsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDmlStatement(DqlParser.DmlStatementContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDmlStatement(DqlParser.DmlStatementContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterQuerySpecificationNointo(DqlParser.QuerySpecificationNointoContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitQuerySpecificationNointo(DqlParser.QuerySpecificationNointoContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSelectElements(DqlParser.SelectElementsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSelectElements(DqlParser.SelectElementsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSelectElement(DqlParser.SelectElementContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSelectElement(DqlParser.SelectElementContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFromClause(DqlParser.FromClauseContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFromClause(DqlParser.FromClauseContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTableSources(DqlParser.TableSourcesContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTableSources(DqlParser.TableSourcesContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEmbbedExpr(DqlParser.EmbbedExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEmbbedExpr(DqlParser.EmbbedExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOrExpr(DqlParser.OrExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOrExpr(DqlParser.OrExprContext ctx) {
        boolean q1 = this.stack.pop();
        boolean q2 = this.stack.pop();
        this.stack.push(q1 || q2);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBoolExpr(DqlParser.BoolExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBoolExpr(DqlParser.BoolExprContext ctx) {
    }

    public boolean compare(Object actualValue, List<String> expectList, String op) {
        if (expectList.size() > 1) {
            return compareSet(actualValue, expectList, op);
        }
        String expectValue = removeQuote(expectList.get(0));
        if (actualValue instanceof Integer) {
            return cmpInt(((Integer) actualValue), Integer.valueOf(expectValue), op);
        }

        if (actualValue instanceof String) {
            return cmpStr(actualValue + "", expectValue, op);
        }
        return false;
    }

    public boolean compareSet(Object actual, List<String> expect, String op) {
        switch (op) {
            case "IN":
            case "NOT IN":
                break;
            default:
                return false;
        }
        if (actual instanceof Integer) {
            switch (op) {
                case "IN":
                    for (String s : expect) {
                        if (actual == Integer.valueOf(s)) {
                            return true;
                        }
                    }
                    return false;
                case "NOT IN":
                    for (String s : expect) {
                        if (actual != Integer.valueOf(s)) {
                            return true;
                        }
                    }
                    return false;
                default:
                    return false;
            }
        }
        if (actual instanceof String) {
            switch (op) {
                case "IN":
                    for (String s : expect) {
                        if (actual.equals(s)) {
                            return true;
                        }
                    }
                    return false;
                case "NOT IN":
                    for (String s : expect) {
                        if (!actual.equals(s)) {
                            return true;
                        }
                    }
                    return false;
                default:
                    return false;
            }
        }
        return false;
    }


    private boolean cmpStr(String s, String expectValue, String op) {
        switch (op) {
            case ">":
                return s.compareTo(expectValue) > 0;
            case "<":
                return s.compareTo(expectValue) < 0;
            case "<=":
                return s.compareTo(expectValue) <= 0;
            case ">=":
                return s.compareTo(expectValue) >= 0;
            case "=":
                return s.compareTo(expectValue) == 0;
            case "!=":
                return s.compareTo(expectValue) != 0;
            default:
                return false;
        }
    }

    public boolean cmpInt(int val, int expectVal, String op) {
        switch (op) {
            case ">":
                return val > expectVal;
            case "<":
                return val < expectVal;
            case "<=":
                return val <= expectVal;
            case ">=":
                return val >= expectVal;
            case "=":
                return val == expectVal;
            case "!=":
                return val != expectVal;
            default:
                return false;
        }
    }

    public String removeQuote(String str) {
        int l = 0, r = str.length();
        if (str.charAt(0) == '\'') {
            l++;
        }
        if (str.charAt(r - 1) == '\'') {
            r--;
        }

        return str.substring(l, r);
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAndExpr(DqlParser.AndExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAndExpr(DqlParser.AndExprContext ctx) {
        boolean q1 = this.stack.pop();
        boolean q2 = this.stack.pop();
        this.stack.push(q1 && q2);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBooleanExpr(DqlParser.BooleanExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBooleanExpr(DqlParser.BooleanExprContext ctx) {
        String operator = ctx.op.getText();
        String fieldName = this.fieldName;
        Object actualValue = this.data.get(fieldName);

        List<String> list = new ArrayList<>();

        List<DqlParser.ValueContext> value = ctx.value();
        for (DqlParser.ValueContext valueContext : value) {
            list.add(valueContext.getText());
        }

        this.stack.push(compare(actualValue, list, operator));

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLeftexpr(DqlParser.LeftexprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLeftexpr(DqlParser.LeftexprContext ctx) {
        this.fieldName = ctx.FIELDNAME().getText();
        List<TerminalNode> funcs = ctx.FUNC();
        this.funcs = new ArrayList<>();
        for (TerminalNode func : funcs) {
            this.funcs.add(func.getText());
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterValue(DqlParser.ValueContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitValue(DqlParser.ValueContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}