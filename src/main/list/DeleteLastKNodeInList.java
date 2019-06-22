package main.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 删除链表中倒数第k个节点
 */
public class DeleteLastKNodeInList {

//    private static List<Integer> list =new ArrayList<>();


    public static void deleteLastKNode(int k) {
        int i = 0;
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(7);

        Iterator<Integer> iterator = list.iterator();
        if (k > list.size()) {//没有倒数第六个数不要遍历了
            return;
        }
        while (i < list.size()) {
            if (i >= k - 1) {//当索引大于等于k-1时可以往后遍历
                iterator.next();
            }
            i++;
        }//跑得快的先遍历完了，那么跑得慢K-1个的自然跑到了倒数第K个位置，这时就可以删除了
        iterator.remove();
        System.out.println(list);
    }

    public static void main(String[] args) {
        deleteLastKNode(6);
    }
}
