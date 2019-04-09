package main.designPattern.behavior.interatorPattern;

/**
 * 要点：迭代器简化了聚合类，一个集合类可以有多个不同的迭代器迭代
 * Created by wong on 2019/4/9.
 */
public class Client {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
