package main.designPattern.behavior.statePattern;

/**
 * Created by wong on 2019/4/9.
 */
public class Context {
    private State state;


    public Context() {

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
