package main.java.exception;

/**
 * Created by wong on 2019/5/1.
 */
public class TestException extends Exception {
    private String desc;
    private int code;

    public TestException(String desc, int code) {
        this.desc = desc;
        this.code = code;
    }

    public TestException(Throwable cause, String desc) {
        super(cause);
        this.desc = desc;
        this.code = -1;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
