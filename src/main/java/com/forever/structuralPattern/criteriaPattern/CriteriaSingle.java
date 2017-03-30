package com.forever.structuralPattern.criteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 没有结婚的
 * Created by forever on 2017-3-23.
 */
public class CriteriaSingle implements  Criteria {
    /**
     * @param personList person集合
     * @return 满足标准的person集合
     */
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> meetPerson = new ArrayList<Person>();
        for (Person person : personList) {
            if ("未婚".equals(person.getMaritalStatus())) {
                meetPerson.add(person);
            }
        }
        return meetPerson;
    }
}
