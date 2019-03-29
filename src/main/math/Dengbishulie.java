package main.math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wong on 2019/3/29.
 */
public class Dengbishulie {

    public static List<List<Integer>> resolution(int start, int end) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            int one = i;
            int two = i * 2;
            int three = i * 3;
            if (three > end) {
                return lists;
            }
            List<Integer> innerList= new ArrayList<>();
            innerList.add(one);
            innerList.add(two);
            innerList.add(three);
            lists.add(innerList);
        }
        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> resolution = resolution(123, 987);
        System.out.println(resolution);
    }
}
