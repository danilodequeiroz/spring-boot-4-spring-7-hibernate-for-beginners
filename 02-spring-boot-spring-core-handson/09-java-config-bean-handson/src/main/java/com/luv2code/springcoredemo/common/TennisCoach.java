package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.printf(
                "%s constructor called%n", getClass().getSimpleName()
        );
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley for 15 minutes!";
    }

}
