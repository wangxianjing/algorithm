package main.designPattern.structure.proxy.sstatic;

/**
 *
 * 静态代理
 *
 * Created by wong on 18/7/2.
 */
public class ProxySubject implements Subject {
    private Subject realSubject = null;

    @Override
    public void play() {
        preMethod();
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.play();
        postMethod();
    }

    public void preMethod() {
        System.out.println("before .......");
    }

    public void postMethod() {
        System.out.println("after .........");
    }

    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.play();
    }

}
