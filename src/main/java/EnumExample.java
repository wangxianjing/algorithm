package main.java;

/**
 * Created by wong on 2018/11/30.
 */
public class EnumExample {
    public enum A {
        AA,
        BB;
    }

    /**
     * 枚举不能传空值
     */
    public static void canNotNull() {
        A a = null;
        switch (a) {
            case AA:
                System.out.println("AA");
                break;
            case BB:
                System.out.println("BB");
                break;
            default:
                System.out.println("NULL");
        }
    }

    // 枚举不能传
    public static void main(String[] args) {
        canNotNull();
    }
}
