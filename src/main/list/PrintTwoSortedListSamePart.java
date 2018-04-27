package main.list;

import java.util.Arrays;
import java.util.List;

/**
 * 两个排序的链表，打印出两者公共的部分
 */
public class PrintTwoSortedListSamePart {

    private static List<Integer> list1 = Arrays.asList(1, 3, 4, 5, 6, 7, 12);
    private static List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 12);

    public static void print() {
        int i = 0;
        int j = 0;
        while ( i < list1.size() && j < list2.size()) {
            while (list1.get(i) < list2.get(j) && i < list1.size()) {//如果list1较小，那么要一直索引自增直到不小于list2当前索引值
                i++;
            }
            while (list1.get(i) > list2.get(j) && j < list2.size()) {//如果此时list2较小，那么要一直索引自增直到不小于list1当前索引值
                j++;
            }
            while (i < list1.size() && j < list2.size() &&list1.get(i) == list2.get(j)) {//如果值相同那各自一直自增下去直到值不同
                System.out.println(list1.get(i));
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        print();
    }
}
