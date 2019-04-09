package main.designPattern.behavior.interpreterPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class ExpressionUtil {

    public static boolean getMaleExpression(String s) {
        Expression Zhang = new TerminalExpression("Zhang");
        Expression Wang = new TerminalExpression("Wang");
        return new OrExpression(Zhang, Wang).interpret(s);
    }

    public static boolean getFemalExpression(String s) {
        Expression Li = new TerminalExpression("Li");
        Expression Na = new TerminalExpression("Na");
        return new AndExpression(Li, Na).interpret(s);
    }

}
