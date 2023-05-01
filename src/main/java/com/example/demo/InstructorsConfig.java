package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    @Bean
    public Instructors tcUsaInstructor(){
        Instructors tcUsa = new Instructors();
        tcUsa.add(new Instructor("null", 0L));
        tcUsa.add(new Instructor("Steve", 1L));
        tcUsa.add(new Instructor("Scuba", 2L));
        return tcUsa;
    }

    @Bean
    public Instructors tcUkInstructor(){
        Instructors tcUk = new Instructors();
        tcUk.add(new Instructor("Kris", 0L));
        tcUk.add(new Instructor("Dolio", 1L));
        tcUk.add(new Instructor("Pizza", 2L));
        return tcUk;
    }

    @Bean
    @Primary
    public Instructors instructor(){
        Instructors instructor = new Instructors();
        instructor.add(new Instructor("pizza", 0L));
        instructor.add(new Instructor("fish", 1L));
        instructor.add(new Instructor("homie", 2L));
        return instructor;
    }
}