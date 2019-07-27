package com.example.demo.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Instructors extends People<Instructor>{

    public Instructors(Instructor...instrctors) {
        super(new ArrayList<>(Arrays.asList(instrctors)));
    }
}
