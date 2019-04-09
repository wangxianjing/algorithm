package main.designPattern.creational.factoryPattern;

/**
 * 一个厂家生产不同产品
 * Created by wong on 2019/4/8.
 */
public interface Factory {
    Product getProduct(String name);
}
