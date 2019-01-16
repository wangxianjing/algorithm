package main.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    private static void testArrayListAndLinkedList() {
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

    /**
     * 是浅拷贝
     */
    public static void testClone() {
        ArrayList<String> list = new ArrayList<>();
        list.add("king");
        list.add("wong");
        ArrayList<String> clone = (ArrayList<String>) list.clone();
        clone.add("wang");
        clone.set(0, "jing");
        System.out.println(list);
        System.out.println(clone);

        System.out.println("---------");

        ArrayList<ArrayList<String>> a = new ArrayList<>();
        a.add(list);
        a.add(clone);
        ArrayList<ArrayList<String>> b = (ArrayList<ArrayList<String>>) a.clone();
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------");
        clone.remove(1);
        System.out.println(a);
        System.out.println(b);
    }

    /**
     * 测试SubList
     */
    public static void testSubList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        List<Integer> integerList = list.subList(100, 200);
        integerList.clear();

//        for (int j = 0; j < list.size(); j++) {
//            if (j >= 100 && j <= 200) {
//                list.remove(j);
//            }
//        }
        System.out.println(list.size());
        System.out.println(list);
    }

    public static void main(String[] args) {
        testSubList();
    }


}
