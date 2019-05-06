package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2018/11/30.
 */
public class AClass implements Cloneable {

    String s;
    int age;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void testPassValue(AClass a) {
        a.age = 100;
    }

    public AClass(String s, int age) {
        this.s = s;
        this.age = age;
    }

    public AClass clone() throws CloneNotSupportedException
    {
        return (AClass)super.clone();
    }

    @Override
    public String toString() {
        return "AClass{" +
                "s='" + s + '\'' +
                ", age=" + age +
                '}';
    }


    public static class BClass {
        String s;
        int age;

        public BClass(String s, int age) {
            this.s = s;
            this.age = age;
        }

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<BClass> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            BClass aClass = new BClass("a",i);
            list.add(aClass);
            System.out.println(aClass);
            if (i == 9){
                try {
                    Thread.sleep(10000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
