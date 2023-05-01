package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Autowired
    @Qualifier("students")
    Instructors instructors;

    @Autowired
    Students students;

    @Bean 
    @DependsOn({"instructors","students"})
    public Classroom currentCohort(){
        return new Classroom(students,instructors);
    }

    @Bean 
    @DependsOn({"instructors","previousStudents"})
    public Classroom pastCohort(){
        return new Classroom(students,instructors);
    }
}
