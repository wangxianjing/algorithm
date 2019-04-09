package main.designPattern.structure.filterPattern;

import java.util.List;

/**
 * Created by wong on 2019/4/8.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> personList);
}
