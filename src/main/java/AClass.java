package main.java;

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
}