package main.designPattern.structure.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2019/4/8.
 */
public class CriteriaFemal implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<>();

        for (Person person : personList) {
            if ("FEMALE".equals(person.getGender())) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
