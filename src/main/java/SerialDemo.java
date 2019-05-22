package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2018/11/22.
 */
public class SerialDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化
        FileOutputStream fos = new FileOutputStream("/Users/wangjing/tmp/object.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        User user1 = new User("xuliugen", "123456", "male");
        User user11 = new User("wong", "d", "male");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user11);
        oos.writeObject(list);
        oos.flush();
        oos.close();
        //反序列化
        FileInputStream fis = new FileInputStream("/Users/wangjing/tmp/object.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<User> newList = (List<User>) ois.readObject();
        System.out.println(newList);
        //反序列化的输出结果为：xuliugen 123456 male
    }
    public static class User implements Serializable {
        private String userName;
        private String password;
        private String sex;
        private static int anInt=32;
        private transient String transientString;

        public User(String userName, String password, String sex) {
            this.userName = userName;
            this.password = password;
            this.sex = sex;
            this.transientString ="transientString********";
        }
        //全参构造方法、get和set方法省略


        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public static int getAnInt() {
            return anInt;
        }

        public static void setAnInt(int anInt) {
            User.anInt = anInt;
        }


        @Override
        public String toString() {
            return "User{" +
                    "userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    ", sex='" + sex + '\'' +
                    ", transientString='" + transientString + '\'' +
                    '}';
        }
    }

}
