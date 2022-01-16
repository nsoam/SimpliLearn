package com.academy.learners.demoadminportal.controllers;

import com.academy.learners.demoadminportal.models.StudClass;
import com.academy.learners.demoadminportal.repositories.StudClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/v1/classes")
public class StudClassController {

    @Autowired
    private StudClassRepository studClassRepository;

    @GetMapping
    public List<StudClass> list(){
        return  studClassRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public List<StudClass> get(@PathVariable String id){
        return studClassRepository.findAllById(Collections.singleton(id));
    }
}
