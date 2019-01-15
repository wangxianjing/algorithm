package main.java;

/**
 * Created by wong on 2018/12/31.
 */
public class CloneExample {

    public static void main(String[] args) {
        //浅拷贝
        AClass a = new AClass("ss", 23);
        AClass copy = a;
        copy.setAge(12);
        System.out.println(a.age);//12

        //深拷贝
        AClass b = new AClass("ww", 18);
        try {
            AClass clone = b.clone();
            clone.setAge(89);
            System.out.println(b.age);//18
            System.out.println(clone.age);//89
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //数组拷贝
        int[] luckyNum = {2, 3, 5, 7, 11, 13};
        int[] cloned = luckyNum.clone();
        cloned[5] = 12;
        System.out.println(luckyNum[5]);
    }

}
