package main.designPattern.behavior.visitorPattern;

/**
 * Created by wong on 2019/4/10.
 */
public class Compute implements ComputerPart {

    ComputerPart[] computerParts = new ComputerPart[]{new Monitor(), new Mouse(), new Keyboard()};

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
