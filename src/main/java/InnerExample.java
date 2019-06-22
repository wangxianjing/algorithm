package main.java;

/**
 * Created by wong on 2018/12/31.
 */
public class InnerExample {
    private int age;
    public String name;
    private InnerClass innerClass;

    public InnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
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

    public InnerClass getInstance() {
        if (innerClass == null) {
            innerClass = new InnerClass();
        }
        return innerClass;
    }

    class InnerClass {

        public InnerClass() {
            age = 10;
            name = "wong";
        }

        private int loc;

        public void addAge() {
            age++;
        }
    }
}
