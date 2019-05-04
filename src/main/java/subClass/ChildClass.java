package main.java.subClass;

import java.util.Objects;

/**
 * Created by wong on 2019/5/1.
 */
public class ChildClass extends ParentClass implements InterfaceA,InterfaceB{
    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类代码块");
    }

    private int value = 2;
    public ChildClass() {
        super(3);
        System.out.println("子类构造函数");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void action() {
        System.out.println("haha");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildClass that = (ChildClass) o;
        return value == that.value;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(value);
//    }
}
