package main.design.structure.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2019/4/8.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<>();

        for (Person person : personList) {
            if ("SINGLE".equals(person.getMaritalStatus())) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
