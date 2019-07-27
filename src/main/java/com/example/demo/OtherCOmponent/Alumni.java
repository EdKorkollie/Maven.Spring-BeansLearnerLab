package com.example.demo.OtherCOmponent;


import com.example.demo.Model.Instructor;
import com.example.demo.Model.Instructors;
import com.example.demo.Model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    private Students students;

    @Autowired
    private Instructors instructors;

    @PostConstruct
    public void execute() {
        for(Instructor instructor: instructors) {
            instructor.lecture(students, (1200.0 * students.size()) / instructors.size());
        }
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students=students;
    }

    public Instructors getInstrctors() {
        return instructors;
    }

    public void setInstrctors(Instructors instrctors) {

        this.instructors=instrctors;
    }
}
