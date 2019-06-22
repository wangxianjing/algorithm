package main.list;

/**
 * 根据头结点head和给定整数pivot，将链表调整为左边都小于pivot，右边都大于pivot，中间都等于pivot
 * <p>
 * Created by wong on 18/5/6.
 */
public class ListPartition {

    public static Node listPartition(Node head, int pivot) {
        if (head == null) return head;
        Node cur = head;
        int length = 0;
        while (cur != null) {
            length++;//计算长度
            cur = cur.getNext();
        }

        Node[] tempArray = new Node[length];//将节点放入数组
        int i = 0;
        cur = head;
        while (cur != null) {
            tempArray[i] = cur;
            cur = cur.getNext();
            i++;
        }

        partition(tempArray, pivot);//交换
        for (i = 1; i < tempArray.length; i++) {
            tempArray[i - 1].setNext(tempArray[i]);//构成链表
        }
        tempArray[length - 1].setNext(null);//设置尾节点的下一个节点
        return tempArray[0];//返回头结点
    }

    public static void partition(Node[] tempArray, int pivot) {
        int small = 0;
        int big = tempArray.length - 1;
        int smallFalg = 0;
        int bigFlag = 0;
        while (small < big) {
            if (smallFalg == 0) {
                if (tempArray[small].getData() < pivot) {
                    small++;
                } else {
                    smallFalg = 1;
                }
            }
            if (bigFlag == 0) {
                if (tempArray[big].getData() > pivot) {
                    big--;
                } else {
                    bigFlag = 1;
                }
            }
            if (smallFalg == 1 && bigFlag == 1) {//当前面的有大于目标值且后面有小于目标值时，相互交换
                swap(tempArray, small, big);
                smallFalg = 0;//交换完毕后标志位清零
                bigFlag = 0;
            }
        }
    }

    public static void swap(Node[] tempArray, int a, int b) {
        Node temp = tempArray[a];
        tempArray[a] = tempArray[b];
        tempArray[b] = temp;
    }

    public static void main(String[] args) {
        Node head = Node.init();

        Node.print(listPartition(head, 5));
    }

}
