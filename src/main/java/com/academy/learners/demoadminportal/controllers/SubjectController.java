package com.academy.learners.demoadminportal.controllers;

import com.academy.learners.demoadminportal.models.Subject;
import com.academy.learners.demoadminportal.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/v1/subjects")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping
    public List<Subject> list(){
        return  subjectRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public List<Subject> get(@PathVariable String id){
        return subjectRepository.findAllById(Collections.singleton(id));
    }
}
