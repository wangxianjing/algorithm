package main.java;

/**
 * Created by wong on 2018/11/30.
 */
public class EnumExample {
    public enum A {
        AA("1",1),
        BB("2",2);
        private String desc;
        private int code;

        A(String desc, int code) {
            this.desc = desc;
            this.code = code;
        }
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

    public static void main(String[] args) {
        //测试枚举valueOf
        System.out.println(A.valueOf("AA").code);

//        canNotNull();
    }
}
