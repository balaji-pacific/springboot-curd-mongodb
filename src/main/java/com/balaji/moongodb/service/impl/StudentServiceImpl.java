package com.balaji.moongodb.service.impl;

import com.balaji.moongodb.entity.StudentDom;
import com.balaji.moongodb.repository.StudentRepository;
import com.balaji.moongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public StudentDom createStudent(StudentDom studentDom) {
        String id = UUID.randomUUID().toString().split("-")[0];
        studentDom.setId(id);
        return studentRepository.save(studentDom);
    }

    @Override
    public StudentDom updateStudent(StudentDom studentDom) {
        StudentDom existingStudent = getStudent(studentDom.getId());
        existingStudent.setId(studentDom.getId());
        existingStudent.setName(studentDom.getName());
        existingStudent.setRollnumber(studentDom.getRollnumber());
        existingStudent.setGrade(studentDom.getGrade());
        return studentRepository.save(existingStudent);
    }

    @Override
    public StudentDom getStudent(String Id) {
        return studentRepository.findById(Id).get();
    }

    @Override
    public String deleteStudent(String Id) {
        StudentDom existingStudent = getStudent(Id);
        studentRepository.delete(existingStudent);
        return "Student record successfully deleted";
    }

    @Override
    public List<StudentDom> getAllStudents() {
        return studentRepository.findAll();
    }
}
