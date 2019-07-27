package com.example.demo.Model;

import com.example.demo.Repository.Teacher;

public class ClassRoom {

    private Students students;
    private Instructors instrctors;

    public ClassRoom(Students students, Instructors instrctors) {
        this.students = students;
        this.instrctors = instrctors;
    }

    public void hostLecture(Teacher teacher, double numberOfHOurs) {
        teacher.lecture(students, numberOfHOurs);
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstrctors() {
        return instrctors;
    }

    public void setInstrctors(Instructors instrctors) {
        this.instrctors = instrctors;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "students=" + students +
                ", instrctors=" + instrctors +
                '}';
    }
}
