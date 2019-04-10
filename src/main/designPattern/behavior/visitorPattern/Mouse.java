package main.designPattern.behavior.visitorPattern;

/**
 * Created by wong on 2019/4/10.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
