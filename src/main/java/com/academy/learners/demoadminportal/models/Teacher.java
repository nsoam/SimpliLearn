package com.academy.learners.demoadminportal.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "teachers")
public class Teacher {
    @Id
    private String teacher_id;

    private String teacher_name;

    public Teacher() {
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }
}
