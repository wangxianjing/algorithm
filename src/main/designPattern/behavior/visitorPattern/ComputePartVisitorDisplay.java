package main.designPattern.behavior.visitorPattern;

/**
 * Created by wong on 2019/4/10.
 */
public class ComputePartVisitorDisplay implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("keyboard display ...");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("monitor display ...");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("mouse display ...");
    }

    @Override
    public void visit(Compute compute) {
        System.out.println("compute display ...");
    }
}
