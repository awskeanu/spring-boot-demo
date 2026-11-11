package com.spring.spring_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component 
@Lazy 
public class SeniorHighStudent implements Student {

    public SeniorHighStudent() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyAssignment() {
        return "Answer the homework.";
    }

}
