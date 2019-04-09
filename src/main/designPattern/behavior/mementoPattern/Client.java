package main.designPattern.behavior.mementoPattern;

/**
 * 要点：1、构造一个类来保存需要保存的数据；2、构造一个类来保存历史版本；3、根据版本回滚
 * 适用场景：需要回滚到历史版本。
 * Created by wong on 2019/4/9.
 */
public class Client {
    public static void main(String[] args) {
        Original original = new Original("v1 xxxxxx");
        MementoList mementoList = new MementoList();
        mementoList.addMeento(original.saveToMemonto());
        original.setState("v2 yyyyyyy");
        mementoList.addMeento(original.saveToMemonto());
        original.setState("v3 zzzzzzz");
        mementoList.addMeento(original.saveToMemonto());

        System.out.println(original.getState());
        original.getStateFromMemonto(mementoList.getMemento(0));
        System.out.println(original.getState());
        original.getStateFromMemonto(mementoList.getMemento(1));
        System.out.println(original.getState());
    }
}
