package main.designPattern.behavior.interpreterPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class AndExpression implements Expression {

    Expression expression1;
    Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String s) {
        return expression1.interpret(s) && expression2.interpret(s);
    }
}
