package com.geekynib.springcoredemo.rest;

import com.geekynib.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define  a private field for the dependency
    private Coach myCoach;

    //define a construtor for dependecy injection
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach){

        System.out.println("In the costructor :"+getClass().getSimpleName());
        this.myCoach=theCoach;
       }


    //Adding setter Injection
//    @Autowired
//    public void doSomeStuff(Coach theCoach){
//      myCoach=theCoach;
//    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


}

