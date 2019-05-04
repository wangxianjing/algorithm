package main.java.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by wong on 2019/5/2.
 */
class User{
    int age;
    String  name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class AtomicReferenceTest {


    public static void main(String[] args) {
        User user1= new User(23,"33");
        User user2= new User(23,"33");
        AtomicReference<User> reference = new AtomicReference<>();
        reference.set(user1);
        System.out.println(reference.compareAndSet(user1,user2));
        System.out.println(reference.compareAndSet(user1,user2));
    }
}
