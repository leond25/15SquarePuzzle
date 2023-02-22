package com.example.myapplication;

import java.util.Random;

/*
 * Author: David Leon
 * Date: 2/21/2023
 *
 *
 */

public class SquareModel {

    private String playerWins; //declare the winning text



    public SquareModel()
    {
        playerWins = "YOU WON!"; //set the winning text to this
    }


    public String getPlayerWins() {
        return playerWins; //get the winning text string
    }


}
