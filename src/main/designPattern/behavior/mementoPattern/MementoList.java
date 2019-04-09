package main.designPattern.behavior.mementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2019/4/9.
 */
public class MementoList {
    private   List<Memento> list = new ArrayList<>();

    public   void addMeento(Memento memento) {
        list.add(memento);
    }

    public Memento getMemento(int index) {
        return list.get(index);
    }
}
