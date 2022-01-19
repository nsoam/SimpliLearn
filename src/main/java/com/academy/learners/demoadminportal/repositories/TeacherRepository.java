package com.academy.learners.demoadminportal.repositories;

import com.academy.learners.demoadminportal.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
//    List<StudClass> findAllById(String id);
}
