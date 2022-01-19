package com.academy.learners.demoadminportal.repositories;

import com.academy.learners.demoadminportal.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, java.lang.String> {
//    List<StudClass> findAllById(String id);
}
