package main.list;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wong on 18/5/1.
 */
public class BaseList {
    public static List<Integer> list = new LinkedList<>();

    static {
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(7);
    }

    public static void print() {
        System.out.println(list);
    }

}
