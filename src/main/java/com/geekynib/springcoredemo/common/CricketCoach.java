package com.geekynib.springcoredemo.common;

import org.springframework.stereotype.Component;


//Component annotation marks the class as Spring Bean for Dependency Injection
@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In the costructor :"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Pratise Fast Bowling !!!";
    }
}
