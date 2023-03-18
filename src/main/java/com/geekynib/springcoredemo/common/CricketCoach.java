package com.geekynib.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//Component annotation marks the class as Spring Bean for Dependency Injection
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In the costructor :"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Pratise Fast Bowling !!!";
    }
}
