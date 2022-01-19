package com.academy.learners.demoadminportal.repositories;

import com.academy.learners.demoadminportal.models.StudClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudClassRepository extends JpaRepository<StudClass, String> {

    @Query("from stud_classes where class_id = ?1")
    List<StudClass> findAllByClassId(String class_id);
}
