package main.designPattern.behavior.templatePattern;

/**
 * Created by wong on 2019/4/10.
 */
public class PingPongGame extends Game {
    @Override
    void initGame() {
        System.out.println("go to ping pong table");
    }

    @Override
    void startGame() {
        System.out.println("start ping pong");
    }

    @Override
    void endGame() {
        System.out.println("end ping pong");
    }
}
