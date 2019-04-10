package main.designPattern.other.mvcPattern;

/**
 * Created by wong on 2019/4/10.
 */
public class Client {
    public static void main(String[] args) {
        StudentModel studentModel = new StudentModel("zhang san", "1");
        StudentController studentController = new StudentController(studentModel, new StudentView());
        studentController.print();

        studentController.setName("li si");
        studentController.print();
    }
}

