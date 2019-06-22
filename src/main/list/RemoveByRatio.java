package main.list;

import java.util.Iterator;
import java.util.List;

/**
 * 删除一个链表中a/b处的节点
 * <p>
 * 思路：假设链表长度为n，那么被删除的是第K个节点，k = ceil(n * a/b)
 * <p>
 * Created by wong on 18/5/1.
 */
public class RemoveByRatio extends BaseList {

    public static void remove(List<Integer> list, int a, int b) {
        int size = list.size();
        int k = (int) Math.ceil((double) (size * a) / (double) b);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext() && k > 0) {
            iterator.next();
            k--;
        }
        if (k == 0) {//如果k大于0，说明到头了但是还没有遍历到第K个。
            iterator.remove();
        }
    }

    public static void main(String[] args) {
        remove(list, 2, 3);
        print();
    }
}
