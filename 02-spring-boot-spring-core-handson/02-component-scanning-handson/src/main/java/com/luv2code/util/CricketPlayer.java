package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class CricketPlayer implements Player {

    @Override
    public String getDailyWorkout() {
        return "Player runs for 15 minutes!!";
    }

}
