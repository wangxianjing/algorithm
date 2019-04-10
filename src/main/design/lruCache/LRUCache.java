package main.design.lruCache;

import java.util.HashMap;

/**
 * Created by wong on 2019/4/9.
 */
public class LRUCache<K, V> {
    private int count;
    private int capacity;
    private Node headNode;
    private Node tailNode;
    private HashMap<K, Node> hashMap = new HashMap<>();

    public V get(K k) {
        Node node = hashMap.get(k);
        if (node == null) {
            return null;
        } else {
            moveToHead(node);
            return node.value;
        }
    }

    public void set(K k, V v) {
        Node node = hashMap.get(k);
        if (node != null) {
            node.setKey(k);
            hashMap.put(k, node);
        } else {
            if (count < capacity) {
                addHeadNode(k, v);
                count++;
            } else {
                removeTailNode();
                addHeadNode(k, v);
            }
        }
    }

    private void moveToHead(Node node) {
        node.getPreNode().setPostNode(node.getPostNode());
        node.getPostNode().setPreNode(node.getPreNode());
        headNode.getPostNode().setPreNode(node);
        node.setPreNode(headNode);
        node.setPostNode(headNode.getPostNode());
        headNode.setPostNode(node);
    }

    private void removeTailNode() {
        System.out.println("remove " + tailNode.getPreNode().getValue());
        hashMap.remove(tailNode.preNode.key);
        tailNode.getPreNode().setPostNode(null);
        tailNode.setPreNode(tailNode.getPreNode().getPreNode());
        tailNode.getPreNode().getPostNode().setPreNode(null);
        tailNode.getPreNode().setPostNode(tailNode);
    }

    private void addHeadNode(K k, V v) {
        Node node;
        node = new Node();
        node.setKey(k);
        node.setValue(v);
        node.setPostNode(headNode.getPostNode());
        node.setPreNode(headNode);
        headNode.getPostNode().setPreNode(node);
        headNode.setPostNode(node);
        hashMap.put(k, node);
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        count = 0;

        headNode = new Node();
        tailNode = new Node();
        headNode.setPreNode(null);
        headNode.setPostNode(tailNode);
        tailNode.setPreNode(headNode);
        tailNode.setPostNode(null);
    }

    public class Node {
        private K key;
        private V value;
        private Node preNode;
        private Node postNode;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node getPreNode() {
            return preNode;
        }

        public void setPreNode(Node preNode) {
            this.preNode = preNode;
        }

        public Node getPostNode() {
            return postNode;
        }

        public void setPostNode(Node postNode) {
            this.postNode = postNode;
        }
    }


}
