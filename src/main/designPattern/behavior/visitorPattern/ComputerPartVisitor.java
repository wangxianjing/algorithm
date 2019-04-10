package main.designPattern.behavior.visitorPattern;

/**
 * Created by wong on 2019/4/10.
 */
public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(Compute compute);
}
