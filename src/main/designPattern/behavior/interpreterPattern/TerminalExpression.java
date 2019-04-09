package main.designPattern.behavior.interpreterPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String s) {
        if (s.contains(data)) {
            return true;
        }
        return false;
    }
}
