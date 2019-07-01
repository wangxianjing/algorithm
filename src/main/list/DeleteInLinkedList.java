package main.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wong on 2019/6/22.
 */
public class DeleteInLinkedList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("fdf");
        list.add("ffd");
        list.add("sds");
        list.add("gfs");
        list.add("pdd");

        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("pdd".equals(next)) {
//            list.remove(next);
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
