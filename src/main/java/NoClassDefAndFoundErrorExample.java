package main.java;

/**
 * Created by wong on 2019/2/27.
 */
public class NoClassDefAndFoundErrorExample {

    public static void main(String[] args) {
        testClassNotFoundException();
//        testtNoClassDefFoundError();
    }

    /**
     * 这是一个异常，运行时会抛出
     */
    private static void testClassNotFoundException() {
        try {
            Class.forName("fff");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 这是一个Error，编译器会抛出
     */
    private static void testtNoClassDefFoundError() {
//        Add a =a new  aDD();
    }

}
