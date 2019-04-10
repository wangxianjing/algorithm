package main.designPattern.behavior.templatePattern;

/**
 * Created by wong on 2019/4/10.
 */
public class BadmintonGame extends Game {

    @Override
    void initGame() {
        System.out.println(" go to badminton table");
    }

    @Override
    void startGame() {
        System.out.println("start  badminton");
    }

    @Override
    void endGame() {
        System.out.println("end badminton");
    }
}
