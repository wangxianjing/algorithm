package main.designPattern.structure.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 要点：运用不同的标准过滤一组对象，然后通过逻辑运算以解耦的方式把他们连接起来。将多个标准结合起来获得单一标准
 * Created by wong on 2019/4/8.
 */
public class Client {
    public static void main(String[] args) {
        Person wang = new Person("wong", "MALE", "SINGLE");
        Person liu = new Person("liu", "FEMALE", "NOT_SINGLE");
        Person z = new Person("z", "MALE", "NOT_SINGLE");
        List<Person> people = new ArrayList<>();
        people.add(wang);
        people.add(liu);
        people.add(z);
        System.out.println(people.size());
        AndCriteria criteria = new AndCriteria(new CriteriaFemal(), new CriteriaSingle());
        List<Person> people1 = criteria.meetCriteria(people);
        System.out.println(people1.size());

    }
}
