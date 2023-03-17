package com.geekynib.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

 public TennisCoach(){
     System.out.println("In the costructor :"+getClass().getSimpleName());
 }
    @Override
    public String getDailyWorkout() {
        return "Practise your backend volley";
    }
}
