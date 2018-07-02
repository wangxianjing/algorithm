package main.design.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wong on 18/7/2.
 */
public class Main {
    public static void main(String[] args) {


        TargetClass targetClass = new TargetClass();

        InvocationHandler handler = new RequestProxy(targetClass);
        Class cls = targetClass.getClass();
        TargetInterface proxyInstance = (TargetInterface) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), handler);

        proxyInstance.play();

    }
}
