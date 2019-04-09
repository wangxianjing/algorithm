package main.designPattern.behavior.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2019/4/9.
 */
public class Subject {
    private int value;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public Subject(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
        System.out.println("Integer update, value:" + value);
        notiryAll();
    }

    public int getValue() {
        return value;
    }

    public void notiryAll() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
