package main.designPattern.behavior.mediatorPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(String content) {
        ChatRoom.sendMessage(this, content);
    }
}
