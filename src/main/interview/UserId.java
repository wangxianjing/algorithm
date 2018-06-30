package main.interview;

/**
 * 问题是编译有没有问题，为什么
 *
 * 答案是编译没有问题
 */
public class UserId {

    public UserId(long uid) {
        this.uid = uid;
    }

    private long uid;
    public UserId(int uid) {
        this.uid = uid;
    }
}
