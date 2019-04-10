package main.designPattern.behavior.visitorPattern;

/**
 * Created by wong on 2019/4/10.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
