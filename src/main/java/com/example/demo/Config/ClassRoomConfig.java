package com.example.demo.Config;

import com.example.demo.Model.ClassRoom;
import com.example.demo.Model.Instructors;
import com.example.demo.Model.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ClassRoomConfig {

    @Bean
    @Primary
    public ClassRoom currentclass(@Qualifier("students")Students students, Instructors instructors) {
        return new ClassRoom(students, instructors);
    }

    @Bean
    public ClassRoom previousclass(@Qualifier("previousStudents") Students students, Instructors instrctors) {
        return new ClassRoom(students, instrctors);
    }
}
