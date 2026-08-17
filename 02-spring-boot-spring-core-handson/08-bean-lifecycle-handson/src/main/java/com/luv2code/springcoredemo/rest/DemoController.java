package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;
    private Coach anotherCoach;

    @Autowired
    public  DemoController(
        @Qualifier("cricketCoach")Coach theCoach,
        @Qualifier("cricketCoach")Coach theAnotherCoach
    ) {
        System.out.printf(
                "%s constructor called%n", getClass().getSimpleName()
        );
        this.coach = theCoach;
        this.anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public  String getDailyWorkout(){
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public  String checkCoaches(){
        return "Comparing beans: coach == anotherCoach, %s".formatted(coach == anotherCoach);
    }
}
