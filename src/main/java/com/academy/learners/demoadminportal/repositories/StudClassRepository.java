package com.academy.learners.demoadminportal.repositories;

import com.academy.learners.demoadminportal.models.StudClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudClassRepository extends JpaRepository<StudClass, String> {
//    List<StudClass> findAllById(String id);
}
