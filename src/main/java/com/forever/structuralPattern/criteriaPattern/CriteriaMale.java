package com.forever.structuralPattern.criteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 性别是男的
 * Created by forever on 2017-3-23.
 */
public class CriteriaMale implements  Criteria {
    /**
     * @param personList person集合
     * @return 满足标准的person集合
     */
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> meetPerson = new ArrayList<Person>();
        for (Person person : personList) {
            if ("男".equals(person.getGender())) {
                meetPerson.add(person);
            }
        }
        return meetPerson;
    }
}
