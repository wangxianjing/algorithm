package main.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by wong on 2019/1/17.
 */
public class HashMapExample {
    public static void testHash() {
        String s = "ffsfsfffffffff33333333333333333fffffffffffff";
        int hashCode = s.hashCode();
        System.out.println(hashCode);
        int newHashCode = hashCode & (hashCode >>> 16);
        System.out.println(newHashCode);
    }

    public static void testForEach() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int a = 0; a < 2000000; a++) {
            hashMap.put(String.valueOf(a), Integer.valueOf(a));
        }
        long start = System.currentTimeMillis();
//        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {//打印kv,14091 ms,只获取38 ms
//            entry.getKey();
//            entry.getValue();
//        }
//        System.out.println("##########");
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
//        while (iterator.hasNext()) {//13974 ms / 38ms
//            Map.Entry<String, Integer> next = iterator.next();
//            next.getKey();
//            next.getValue();
//        }
//        System.out.println("##########");
//        for (String key : hashMap.keySet()) {// 14009ms / 58ms
//            hashMap.get(key);
//        }
//        System.out.println("##########");
//
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {// 14206ms /38ms
            entry.getKey();
            entry.getValue();
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void testClone() {//浅拷贝

        HashMap<String, AClass> hashMap = new HashMap<>();
        AClass a = new AClass("aa", 1);
        AClass b = new AClass("bb", 2);
        hashMap.put("1", a);
        hashMap.put("2", b);
        System.out.println(hashMap);
        System.out.println("#########");

        HashMap<String, AClass> clone = (HashMap<String, AClass>) hashMap.clone();
        AClass aClass = clone.get("1");
        aClass.setAge(3434);
        System.out.println(clone);
        System.out.println("#########");
        System.out.println(hashMap);
    }

    public static void main(String[] args) {
        testClone();
    }
}
