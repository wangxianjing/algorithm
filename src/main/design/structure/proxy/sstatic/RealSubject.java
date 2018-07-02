package main.design.structure.proxy.sstatic;

/**
 * Created by wong on 18/7/2.
 */
public class RealSubject implements Subject {

    @Override
    public void play() {
        System.out.println("RealSubject play .....");
    }
}
