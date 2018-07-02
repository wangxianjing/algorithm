package main.design.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * 动态代理
 *
 * Created by wong on 18/7/2.
 */
public class RequestProxy implements InvocationHandler{
    private Object target;

    public RequestProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preMethod();
        method.invoke(target, args);
        postMethod();
        return null;
    }

    public void preMethod() {
        System.out.println("proxy class,heihei .......");
    }

    public void postMethod() {
        System.out.println("proxy class,haha .........");
    }
}
