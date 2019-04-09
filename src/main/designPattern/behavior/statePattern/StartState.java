package main.designPattern.behavior.statePattern;

/**
 * Created by wong on 2019/4/9.
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return " start state ..";
    }
}
