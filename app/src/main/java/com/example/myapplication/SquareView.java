package com.example.myapplication;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/*
 * Author: David Leon
 * Date: 2/21/2023
 *
 *
 */

public class SquareView {

    public Button[][] buttons; //declare a 2D array of button objects
    public TextView playerWins; //declare a text object for when the player wins
    private SquareModel model; //declare a SquareModel object for the button
    private Random rng; //declare a random object

    private Button resetButton; //declare a reset button


    public SquareView(SquareModel m) {
        model = m; //initialize model
        buttons = new Button[4][4]; //initialize buttons


    }

    public void addButton(int row, int col, Button b) {
        buttons[row][col] = b; //add a button to the 2D array
    }

    public void addResetButton(Button button) {
        resetButton = button; //add the reset button
        button.setBackgroundColor(Color.RED); //make the button red
    }


    public void addTextView(TextView text) {
        playerWins = text; //initialize the winning text
    }

    public void setText(String player_Wins) {
        playerWins.setText(player_Wins); //set the winning text
    }

    /*
    * This method displays all the buttons on the screen
    */
    public void displayButtons() {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                buttons[i][j].setVisibility(View.VISIBLE); //set all squares visible

                if (i == 3 && j == 3) {
                    buttons[i][j].setVisibility(View.INVISIBLE); //except the very bottom right square
                }

            }
        }
    }

    /*
     * This method shuffles all the buttons on the screen
     */

    public void shuffleButtons() {

        rng = new Random(); //create a new random object
        int randomIndex1; //index 1 of the button
        int randomIndex2; //index 2 of the button

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {


                    randomIndex1 = rng.nextInt(4); //generate a random number from 0-3 for the first index
                    randomIndex2 = rng.nextInt(4); //generate a random number from 0-3 for the second index

                /*this if statement guarantees that the randomizer cannot select indexes 3 and 3 (the very bottom right square) which contains an empty string*/
                   if (randomIndex1 == 3 && randomIndex2 == 3) {
                       randomIndex1 -= rng.nextInt(2) + 1;
                        randomIndex2 -= rng.nextInt(2) + 1;
                    }
                /*get the strings*/
                    String num1 = (String) buttons[randomIndex1][randomIndex2].getText();
                    String num2 = (String) buttons[i][j].getText();

                 if(!(i == 3 && j == 3)) { //if we are not at indexes 3 and 3 (the very bottom right square)
                     /*swap the strings*/
                     buttons[randomIndex1][randomIndex2].setText(num2);
                     buttons[i][j].setText(num1);
                 }
                else if(i == 3 && j == 3) { //if we are at the very bottom right of the square
                     buttons[randomIndex1][randomIndex2].setText(num1); //just set the text to a random button
                 }

            }
        }
    }

    /*
     * This method finds out if the player has won or not after each square move
     */

    public boolean findResult() {

        /* This array is used to compare the strings of the current board*/
        String[] stringArray = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};

        int result = 0; //the result to increment
        int z = 0; //this is used to increment the index in the stringArray

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {


                if (!(i == 3 && j == 3) && buttons[i][j].getText().equals(stringArray[z])) {
                    result++; //if we are not at the very bottom right square
                }             //then compare the strings
                z++;          //if they are equal then increment result
            }

        }
        if (result == 15) { //if all the strings matched then return true
           return true;
        }
        else { //otherwise return false
            return false;
        }

    }

    /*
     * This method changes all the squares to green when the user wins
     */
    public void winnerIndication() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                    buttons[i][j].setBackgroundColor(Color.GREEN);
                    buttons[i][j].setTextColor(Color.BLACK);
            }
        }
    }

    /*
     * This method sets all the squares to blue as the default color
     */

    public void buttonDefaultColor() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                    buttons[i][j].setBackgroundColor(Color.BLUE);
                    buttons[i][j].setTextColor(Color.WHITE);
            }
        }
    }

    /*
     * This method sets the click ability to each square and the reset button
     */

    public void setListener(View.OnClickListener ocl)
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                buttons[i][j].setOnClickListener(ocl);
            }
        }
        resetButton.setOnClickListener(ocl);
    }
}
