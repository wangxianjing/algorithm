package main.design.structure.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2019/4/8.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersons = new ArrayList<>();

        for (Person person : personList) {
            if ("MALE".equals(person.getGender())) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
