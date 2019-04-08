package main.design.structure.filterPattern;

import java.util.List;

/**
 * Created by wong on 2019/4/8.
 */
public class AndCriteria implements Criteria {

    private Criteria criteriaA;
    private Criteria criteriaB;

    public AndCriteria(Criteria criteriaA, Criteria criteriaB) {
        this.criteriaA = criteriaA;
        this.criteriaB = criteriaB;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> people = criteriaA.meetCriteria(personList);
        return criteriaB.meetCriteria(people);
    }
}
