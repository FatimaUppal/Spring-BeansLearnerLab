package com.example.demo;

public class Person {
    String name; 
    final long id;
    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }

}
