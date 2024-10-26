package com.balaji.moongodb.controller;

import com.balaji.moongodb.entity.StudentDom;
import com.balaji.moongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("create-student")
    public StudentDom createStudent(@RequestBody StudentDom studentDom){
        return studentService.createStudent(studentDom);
    }

    @PutMapping("update-student")
    public StudentDom updateStudent(@RequestBody StudentDom studentDom){
        return studentService.updateStudent(studentDom);
    }

    @GetMapping("get-student-info/{id}")
    public StudentDom getStudent(@PathVariable String id){
        return studentService.getStudent(id);
    }

    @DeleteMapping("delete-student/{id}")
    public String deleteStudent(@PathVariable String id){
        return studentService.deleteStudent(id);
    }

    @GetMapping("get-all-students")
    public List<StudentDom> getAllStudent(){
        return studentService.getAllStudents();
    }

}
