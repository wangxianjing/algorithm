package main.java.clone;

/**
 * Created by wong on 2019/6/14.
 */
public class Client {

    public static void testConstructorShadowCopy() {
        ConstructorShadowCopy origin = new ConstructorShadowCopy(2, "wong");
        ConstructorShadowCopy newObject = new ConstructorShadowCopy(origin);
        System.out.println(origin == newObject);
        System.out.println(origin.getName() == newObject.getName());
        origin.setName(new String("fffff"));
        System.out.println(newObject.getName());
        System.out.println(origin.getName());
    }

    public static void testCloneShadowCopy() {
        ConstructorShadowCopy origin = new ConstructorShadowCopy(2, "wong");
        try {
            ConstructorShadowCopy clone = (ConstructorShadowCopy) origin.clone();
            System.out.println(clone.getName() == origin.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testConstructorShadowCopy();
        System.out.println("-------------");
        testCloneShadowCopy();
     }
}
