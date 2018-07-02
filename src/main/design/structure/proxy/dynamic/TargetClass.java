package main.design.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wong on 18/7/2.
 */
public class TargetClass implements TargetInterface {

    public void play() {
        System.out.println("target class ,hao xi .........");
    }


}
