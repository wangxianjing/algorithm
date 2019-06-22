package main.list;

/**
 * Created by wong on 18/5/6.
 */
public class Node {
    private int data;
    private Node next;


    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void print(Node head) {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
    }


    public static Node init() {
        Node head = new Node(1);
        Node node1 = new Node(10);
        head.setNext(node1);
        Node node2 = new Node(4);
        node1.setNext(node2);
        Node node3 = new Node(5);
        node2.setNext(node3);
        Node node4 = new Node(9);
        node3.setNext(node4);
        return head;
    }

}
