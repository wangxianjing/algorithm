package main.designPattern.behavior.mementoPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class Original {
    private String state;

    public Original(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemonto() {
        return new Memento(state);
    }

    public String getState() {
        return state;
    }

    public void getStateFromMemonto(Memento memento) {
        state = memento.getState();
    }
}
