package com.example.demo.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students extends People<Student>{

    public Students(Student...students) {
        super(new ArrayList<>(Arrays.asList(students)));
    }
}
