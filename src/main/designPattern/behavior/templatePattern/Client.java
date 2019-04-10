package main.designPattern.behavior.templatePattern;

/**
 * 要点：建立一个抽象类，里面有public的方法调用abstract方法，之类实现抽象方法。使用者调用public方法。
 * Created by wong on 2019/4/10.
 */
public class Client {
    public static void main(String[] args) {
        Game badmintonGame = new BadmintonGame();
        Game pingPongGame = new PingPongGame();

        badmintonGame.play();
        pingPongGame.play();
    }
}
