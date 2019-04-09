package main.designPattern.behavior.mediatorPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class ChatRoom {
    public static void sendMessage(User user, String content) {
        System.out.println("[" + user.getName() + "]:" + content);
    }
}
