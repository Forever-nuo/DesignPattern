package com.forever.structuralPattern.criteriaPattern;

import java.util.List;

/**
 * 标准接口
 * Created by forever on 2017-3-23.
 */
public interface Criteria {
    /**
     * @param personList person集合
     * @return  满足标准的person集合
     */
    List<Person> meetCriteria(List<Person> personList);
}
