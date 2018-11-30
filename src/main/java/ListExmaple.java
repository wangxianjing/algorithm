package main.java;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by wong on 2018/11/30.
 */
public class ListExmaple {

    public static ArrayList<String> buildArrayList(int count) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }

    public static LinkedList<String> buildLinkedList(int count) {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }

    public static void main(String[] args) {
        int count = 10000000;
        ArrayList<String> arrayList = buildArrayList(count);
        LinkedList<String> linkedList = buildLinkedList(count);

        long start = System.currentTimeMillis();
        arrayList.remove(String.valueOf(count / 2));//从中间定点删除的话arraylist要快，因为移动很快，位置挨着的，
        // linkedlist要从头到尾遍历。无论是根据元素删除还是根据下标删除
//        linkedList.remove(String.valueOf(count / 2));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
