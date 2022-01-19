package com.academy.learners.demoadminportal.repositories;

import com.academy.learners.demoadminportal.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, String> {
//    List<StudClass> findAllById(String id);
}
