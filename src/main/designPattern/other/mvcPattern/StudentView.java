package main.designPattern.other.mvcPattern;

/**
 * Created by wong on 2019/4/10.
 */
public class StudentView {
    public void view(StudentModel studentModel) {
        System.out.println("view: " + studentModel.getName() + "  " + studentModel.getNo());
    }
}
