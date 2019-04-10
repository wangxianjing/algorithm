package main.designPattern.other.mvcPattern;

/**
 * Created by wong on 2019/4/10.
 */
public class StudentController {
    private StudentModel studentModel;
    private StudentView studentView;

    public StudentController(StudentModel studentModel, StudentView studentView) {
        this.studentModel = studentModel;
        this.studentView = studentView;
    }

    public void setName(String name) {
        studentModel.setName(name);
    }

    public void setNo(String no) {
        studentModel.setNo(no);
    }

    public void print() {
        studentView.view(studentModel);
    }
}
