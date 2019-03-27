package cc.tpark;

import cc.tpark.dql.DqlBaseListener;
import cc.tpark.dql.DqlLexer;
import cc.tpark.dql.DqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String s = "SELECT * FROM DUAL WHERE name='deen' AND age>=23 AND (hobby IN ('soccer', 'swim') OR score > 90)";
        System.out.println(match(s));

    }

    public static Object match(String dql) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "deen");
        data.put("age", 23);
        data.put("hobby", "basketball");
        data.put("score", 100);

        CharStream input = CharStreams.fromString(dql);
        DqlLexer dqlLexer = new DqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(dqlLexer);
        DqlParser parser = new DqlParser(tokens);
        parser.setBuildParseTree(true);
        parser.removeErrorListeners();

        DqlParser.RootContext tree = parser.root();

        Stack<Boolean> stack = new Stack<>();
        DqlBaseListener dqlBaseListener = new DqlBaseListener(stack);
        dqlBaseListener.setData(data);
        dqlBaseListener.enterRoot(tree);


        new ParseTreeWalker().walk(dqlBaseListener, tree);

        System.out.println(tree.toStringTree());

        return stack.pop();
    }
}
