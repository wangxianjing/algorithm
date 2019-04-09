package main.designPattern.behavior.interpreterPattern;

/**
 * 要点：用于构建语法树，编译器，表达式计算
 * <p>
 * Created by wong on 2019/4/9.
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(ExpressionUtil.getMaleExpression("Zhang"));
        System.out.println(ExpressionUtil.getMaleExpression("Zha"));

        System.out.println(ExpressionUtil.getFemalExpression("Li Na is femal"));
        System.out.println(ExpressionUtil.getFemalExpression("Li Nia is femal"));
    }
}
