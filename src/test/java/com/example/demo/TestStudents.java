package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class TestStudents {

    @Autowired
    Students students;

    @Autowired
    @Qualifier("pastStudents")
    Students pastStudents;

    @Test 
    public void testStudents(){
        Assertions.assertEquals(students.findAll().get(0).getName(),"Frank");
    }

    @Test 
    public void testPastStudents(){
        Assertions.assertEquals(students.findAll().get(0).getName(),"Oscar");
    }
}
