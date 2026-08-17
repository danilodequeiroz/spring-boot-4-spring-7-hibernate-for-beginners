package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.printf(
            "%s constructor called%n", getClass().getSimpleName()
        );
    }

    // define our init method
    @PostConstruct
    public void doOnStartup(){
        System.out.printf(
                "In doOnStartup(): %s%n", getClass().getSimpleName()
        );
    }

    // define our destroy method
    @PreDestroy
    public void doOnCleanup(){
        System.out.printf(
                "In doOnCleanup(): %s%n", getClass().getSimpleName()
        );
    }



    @Override
    public String getDailyWorkout() {
        return "Practice fast Bowling for 15 minutes!";
    }

}
