package com.geekynib.springcoredemo.common;

import org.springframework.stereotype.Component;


//Component annotation marks the class as Spring Bean for Dependency Injection
@Component
public class CricketCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Pratise Fast Bowling !!!";
    }
}
