package com.forever.structuralPattern.criteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.以 逻辑运算符过滤一组对象
 * Created by forever on 2017-3-23.
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert", "男", "未婚"));
        persons.add(new Person("John", "男", "已婚"));
        persons.add(new Person("Laura", "女", "已婚"));
        persons.add(new Person("Diana", "女", "未婚"));
        persons.add(new Person("Mike", "男", "未婚"));
        persons.add(new Person("Bobby", "男", "未婚"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);

        printPersons(male.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
