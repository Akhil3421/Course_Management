package com.example.demo.controller;

import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    SubjectService service;

    @PostMapping("/createsubject")
    public Subject add(@RequestBody Subject subject)
    {
        return service.add(subject);
    }
    @GetMapping("/getsubjects")
    public List<Subject> getSubjects()
    {
        return service.getSubjects();
    }

}
