package com.forever.otherPattern.dataAccessObjectPattern;

import java.util.List;

/**
 * Created by forever on 2017-3-30.
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
