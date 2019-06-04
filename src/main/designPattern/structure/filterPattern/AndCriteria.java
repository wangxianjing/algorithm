package main.designPattern.structure.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2019/4/8.
 */
public class AndCriteria implements Criteria {

    private List<Criteria> list = new ArrayList<>();

    public AndCriteria() {
    }

    public void addCriteria(Criteria criteria) {
        list.add(criteria);
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        for (Criteria criteria : list) {
            personList = criteria.meetCriteria(personList);
        }
        return personList;
    }
}
