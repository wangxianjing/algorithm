package main.design.structure.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
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
