package com.academy.learners.demoadminportal.controllers;

import com.academy.learners.demoadminportal.models.Teacher;
import com.academy.learners.demoadminportal.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/v1/teachers")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping
    public List<Teacher> list(){
        return  teacherRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public List<Teacher> get(@PathVariable String id){
        return teacherRepository.findAllById(Collections.singleton(id));
    }
}
