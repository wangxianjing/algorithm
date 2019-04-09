package main.designPattern.behavior.statePattern;

/**
 * 主要解决：让对象的行为依赖于对象的状态，可以让状态的改变而改变相关的行为
 * <p>
 * Created by wong on 2019/4/9.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        State startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
