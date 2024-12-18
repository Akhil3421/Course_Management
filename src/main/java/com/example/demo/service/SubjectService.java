package com.example.demo.service;

import com.example.demo.model.Subject;
import com.example.demo.repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    SubjectRepo repo;

    public List<Subject> getSubjects() {
        return repo.findAll();
    }

    public Subject add(Subject subject) {
        repo.save(subject);
        return subject;
    }
}
