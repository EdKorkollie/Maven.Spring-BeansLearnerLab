package com.example.demo.Config;

import com.example.demo.Model.Student;
import com.example.demo.Model.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        Student[] stuArray = new Student[10];
        String[] stunames = {"Ed", "ANish", "Rob", "Will", "Dan", "Connor", "Ajulu", "Reese", "Caleb","Henry"};
        for(int i =0; i<stuArray.length; i++) {

            stuArray[i] = new Student(i, stunames[i]);
        }
        return new Students(stuArray);
    }

    @Bean
    public Students previousStudents() {
        Student[] stuArray = new Student[10];

        String[] stunames = {"Stephan", "Alicia", "Joana", "Kyva", "Ben c", "Ben R", "Angelica", "Sputnika", "Dasha", "Alex"};

        for(int i = 0; i< stuArray.length; i++) {
            stuArray[i] = new Student(i, stunames[i]);
        }
        return new Students(stuArray);

    }
}
