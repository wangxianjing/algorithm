package main.java.subClass;

/**
 * Created by wong on 2019/5/1.
 */
public class ParentClass {

    public ParentClass(int value) {
        System.out.println("父类构造函数");
        this.value = value;
    }

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类代码块");
    }
    private int value = 1;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
