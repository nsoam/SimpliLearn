package com.academy.learners.demoadminportal.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "subjects")
public class Subject {
    @Id
    private String subject_id;

    private String subject_name;

    public Subject() {
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
}
