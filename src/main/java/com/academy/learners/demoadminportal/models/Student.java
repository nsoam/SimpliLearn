package com.academy.learners.demoadminportal.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity(name = "students")
public class Student {

        @Id
        private String student_id;

        private String student_name;

     /*   @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "class_student_id")
        @JsonManagedReference*/
//        private List<StudClass> studClassSet;

        public Student() {
        }

        public String getStudent_id() {
                return student_id;
        }

        public void setStudent_id(String student_id) {
                this.student_id = student_id;
        }

        public String getStudent_name() {
                return student_name;
        }

        public void setStudent_name(String student_name) {
                this.student_name = student_name;
        }
}
