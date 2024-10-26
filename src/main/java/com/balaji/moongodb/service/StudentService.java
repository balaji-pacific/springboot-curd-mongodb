package com.balaji.moongodb.service;

import com.balaji.moongodb.entity.StudentDom;

import java.util.List;

public interface StudentService {

    StudentDom createStudent(StudentDom studentDom);
    StudentDom updateStudent(StudentDom studentDom);
    StudentDom getStudent(String Id);
    String deleteStudent(String Id);
    List<StudentDom> getAllStudents();
}
