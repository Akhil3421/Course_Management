package com.example.demo.controller;

import com.example.demo.service.StudentService;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/createstudent")
    public Student create(@RequestBody Student student)
    {
        System.out.println(student);
        return service.add(student);
    }

    @GetMapping("/getstudents")
    public List<Student> getStudents()
    {
        return service.getStudents();
    }
}
