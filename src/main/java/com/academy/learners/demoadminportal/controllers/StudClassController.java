package com.academy.learners.demoadminportal.controllers;

import com.academy.learners.demoadminportal.models.ClassDetail;
import com.academy.learners.demoadminportal.models.StudClass;
import com.academy.learners.demoadminportal.repositories.StudClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/v1/classes")
public class StudClassController {

    @Autowired
    private StudClassRepository studClassRepository;

    @GetMapping
    public List<ClassDetail> list(){
        List<StudClass> list = studClassRepository.findAll();
        return getClassDetails(list);
    }

    @GetMapping
    @RequestMapping("{id}")
    public List<ClassDetail> get(@PathVariable String id){
        List<StudClass> list = studClassRepository.findAllByClassId(id);

        return getClassDetails(list);
    }

    private List<ClassDetail> getClassDetails(List<StudClass> list) {
        Map<String, ClassDetail> classDetailMap = new HashMap<>();

        for (StudClass studClass : list) {
            final String classId = studClass.getClass_id();

            if(classDetailMap.containsKey(classId)) {
                ClassDetail classDetail = classDetailMap.get(classId);

                ClassDetail.Student student = new ClassDetail.Student();
                student.setStudentId(studClass.getStudent_id());
                student.setStudentName(studClass.getStudent_name()); // TODO
                List<ClassDetail.Student> students = classDetail.getStudents();
                students.add(student);

                ClassDetail.Subject subject = new ClassDetail.Subject();
                subject.setSubjectId(studClass.getSubject_id());
                subject.setSubjectName(studClass.getSubject_name()); // TODO
                subject.setTeacherId(studClass.getTeacher_id());
                subject.setTeacherName(studClass.getTeacher_name()); // TODO

                List<ClassDetail.Subject> subjects = classDetail.getSubjects();;
                subjects.add(subject);

               classDetail.setStudents(students);
               classDetail.setSubjects(subjects);
            } else {
                ClassDetail classDetail = new ClassDetail();
                classDetail.setClassId(classId);
                classDetail.setClassName(studClass.getClass_name());

                ClassDetail.Student student = new ClassDetail.Student();
                student.setStudentId(studClass.getStudent_id());
                student.setStudentName(studClass.getStudent_name()); // TODO
                List<ClassDetail.Student> students = new ArrayList<>();
                students.add(student);

                ClassDetail.Subject subject = new ClassDetail.Subject();
                subject.setSubjectId(studClass.getSubject_id());
                subject.setSubjectName(studClass.getSubject_name()); // TODO
                subject.setTeacherId(studClass.getTeacher_id());
                subject.setTeacherName(studClass.getTeacher_name()); // TODO

                List<ClassDetail.Subject> subjects = new ArrayList<>();
                subjects.add(subject);

                classDetail.setStudents(students);
                classDetail.setSubjects(subjects);

                classDetailMap.put(classId, classDetail);
            }
        }

        return new ArrayList<>(classDetailMap.values());
    }
}
