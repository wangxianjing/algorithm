package main.designPattern.behavior.visitorPattern;

/**
 * Created by wong on 2019/4/10.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
