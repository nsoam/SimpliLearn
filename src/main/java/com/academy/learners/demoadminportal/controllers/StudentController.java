package com.academy.learners.demoadminportal.controllers;

import com.academy.learners.demoadminportal.models.Student;
import com.academy.learners.demoadminportal.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> list(){
        return  studentRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public List<Student> get(@PathVariable java.lang.String id){
        return studentRepository.findAllById(Collections.singleton(id));
    }
}
