package main.designPattern.behavior.templatePattern;

/**
 * Created by wong on 2019/4/10.
 */
public abstract class Game {
    abstract void initGame();

    abstract void startGame();

    abstract void endGame();

    public void play() {
        initGame();
        startGame();
        endGame();
    }
}
