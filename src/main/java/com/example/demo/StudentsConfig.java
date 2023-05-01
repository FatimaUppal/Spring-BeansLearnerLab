package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentsConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        Students current = new Students();
        current.add(new Student("Frank", 0));
        current.add(new Student("Fran", 1));
        current.add(new Student("everybody", 2));
        current.add(new Student("skip", 4));
        return current;
    }
    
}












