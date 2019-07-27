package com.example.demo.Config;

import com.example.demo.Model.Instructor;
import com.example.demo.Model.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors zipCodeInstructor() {
        Instructor[] arrInst = new Instructor[6];

        for(int i = 0; i<arrInst.length; i++) {
            arrInst[i] = new Instructor(i, "ZipCodeInstructpr" + i);
        }
        return new Instructors(arrInst);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors zipWilmingtoInst(){
        Instructor[] arrInst = new Instructor[6];
        String[] instructorName = {"Doli", "Leon" , "Kris", "Wilhem", "Roberto", "Nhu"};
        for(int i = 0; i< arrInst.length; i++) {
            arrInst[i] = new Instructor(i, instructorName[i]);
        }
        return new Instructors(arrInst);
    }
}
