package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.printf(
                "%s constructor called%n", getClass().getSimpleName()
        );
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast Bowling for 15 minutes!";
    }

}
