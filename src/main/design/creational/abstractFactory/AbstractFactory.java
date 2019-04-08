package main.design.creational.abstractFactory;

/**
 * 一个工厂生产不同厂家的不同类型的产品
 * <p>
 * Created by wong on 2019/4/3.
 */
public interface AbstractFactory {
    Phone getPhone();

    Paid getPaid();
}
