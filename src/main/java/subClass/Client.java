package main.java.subClass;

import java.util.HashMap;

/**
 * Created by wong on 2019/5/1.
 */
public class Client {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        System.out.println(childClass.getValue());
        childClass.action();

        HashMap<String,String> map = new HashMap<>();
        map.put(null,null);
        System.out.println(map.size());
        System.out.println(map.get(null));
    }
}


