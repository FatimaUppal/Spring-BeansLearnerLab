package com.example.demo;

public class Instructor extends Person implements Teacher {

    public Instructor(String name, long id) {
        super(name, id);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
       learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count = 0;
        for (Learner learner : learners) {
            count++;
        }
        for (Learner learner : learners) {
            learner.learn(numberOfHours/count);
        }
    } 
}

