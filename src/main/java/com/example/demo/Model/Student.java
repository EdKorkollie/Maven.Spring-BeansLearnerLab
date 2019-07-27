package com.example.demo.Model;

import com.example.demo.Repository.Learner;

public class Student extends Person implements Learner {

    double totalStudyTime;


    public Student(long id, String name) {
        super(id, name);

    }

    @Override
    public void learn(double numberOfHours) {

        totalStudyTime = totalStudyTime + numberOfHours;

    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
