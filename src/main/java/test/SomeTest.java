package main.java.test;

/**
 * Created by wong on 2019/4/27.
 */
public class SomeTest {
    public final static int TRANSACTION_PREPARED_TYPE = 0x1 << 2;
    public static void change2A(String s) {
        s="a";
    }
    public static void main(String[] args) {

        String s = "s";
        s ="b";
        change2A(s);
        System.out.println(s);
    }
}
