package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public Student add(Student student) {
        repo.save(student);
        return student;
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
