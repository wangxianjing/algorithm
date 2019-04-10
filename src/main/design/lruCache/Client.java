package main.design.lruCache;

/**
 * Created by wong on 2019/4/10.
 */
public class Client {
    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache<>(4);
        lruCache.set(1,"1");
        lruCache.set(2,"2");
        lruCache.set(3,"3");
        lruCache.set(4,"4");
        System.out.println(lruCache.get(1));
        lruCache.set(5,"5");
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
    }
}
