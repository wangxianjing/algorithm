package main.java;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
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

        List<Integer> integerList = list.subList(100, 105);
        integerList.clear();

//        for (int j = 0; j < list.size(); j++) {
//            if (j >= 100 && j <= 200) {
//                list.remove(j);
//            }
//        }
        System.out.println(list.size());
        System.out.println(list);
    }


    public static void testArrayList() {

        List<String> str1 = new ArrayList<String>();
        str1.add("ab");
        str1.add("bc");
        Object[] strs1 = str1.toArray();
        strs1[0] = new Object();
        strs1[1] = new Integer(3);
        System.out.println("strs1:");
        System.out.println(str1.toString());
// class [Ljava.lang.Object;
        System.out.println(strs1.getClass());
// class java.util.ArrayList
        System.out.println(str1.getClass());
        System.out.println(str1.get(0).getClass());
        System.out.println(strs1[0].getClass());
        System.out.println(strs1[1].getClass());


        List<String> str2 = Arrays.asList(new String[]{"ab", "bc"});
        Object[] strs2 = str2.toArray();
        System.out.println("strs2:");
        System.out.println(str2.toString());
// class [Ljava.lang.String;
        System.out.println(strs2.getClass());
// class java.util.Arrays$ArrayList
        System.out.println(str2.getClass());
        System.out.println(str2.get(0).getClass());
        System.out.println(strs2[0].getClass());
//  java.lang.ArrayStoreException
//        strs2[0] = new Object();

    }

    public static void test() {
        Object[] o = new Object[3];
        o[0] = new Object();
        o[1] = new String();
    }

    public static void testTrimToSize() throws NoSuchFieldException, IllegalAccessException {
        ArrayList list=new ArrayList(12);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Field field=list.getClass().getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] f= (Object[]) field.get(list);
        System.out.println(list.size());
        System.out.println("list的容量"+f.length);
        list.trimToSize();

        Field field1=list.getClass().getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] f1= (Object[]) field.get(list);
        System.out.println(list.size());
        System.out.println("list的容量"+f1.length);
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        testTrimToSize();
    }


}
