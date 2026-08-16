package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.util.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    private Player player;

    @Autowired
    public PlayerController(Player thePlayer){
        player = thePlayer;
    }

    @GetMapping("/player/dailyworkout")
    public  String getDailyWorkout(){
        return player.getDailyWorkout();
    }
}
