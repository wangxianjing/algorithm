package main.designPattern.other.mvcPattern;

/**
 * Created by wong on 2019/4/10.
 */
public class StudentModel {
    private String name;
    private String no;

    public StudentModel(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
