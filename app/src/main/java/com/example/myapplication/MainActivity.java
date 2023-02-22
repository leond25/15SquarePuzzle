package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

/*
* Author: David Leon
* Date: 2/21/2023
*
* This is a 15-Squares Puzzle game
*
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SquareModel model = new SquareModel(); //create model object for a button
        SquareView view = new SquareView(model); //create view object for a button

        /*Add all the buttons in the 2D array*/
        view.addButton(0,0, findViewById(R.id.b_11));
        view.addButton(0,1, findViewById(R.id.b_12));
        view.addButton(0,2, findViewById(R.id.b_13));
        view.addButton(0,3, findViewById(R.id.b_14));
        view.addButton(1,0, findViewById(R.id.b_21));
        view.addButton(1,1, findViewById(R.id.b_22));
        view.addButton(1,2, findViewById(R.id.b_23));
        view.addButton(1,3, findViewById(R.id.b_24));
        view.addButton(2,0, findViewById(R.id.b_31));
        view.addButton(2,1, findViewById(R.id.b_32));
        view.addButton(2,2, findViewById(R.id.b_33));
        view.addButton(2,3, findViewById(R.id.b_34));
        view.addButton(3,0, findViewById(R.id.b_41));
        view.addButton(3,1, findViewById(R.id.b_42));
        view.addButton(3,2, findViewById(R.id.b_43));
        view.addButton(3,3, findViewById(R.id.b_44));

        view.addResetButton(findViewById(R.id.b__reset)); //add reset button


        view.addTextView(findViewById(R.id.textView)); //add the winning textview

        view.buttonDefaultColor(); //set the default color for the squares to blue


        view.displayButtons(); //display the squares with an empty button at the bottom right
        view.shuffleButtons(); //shuffle the squares


        SquareController controller = new SquareController(model, view); //create controller object for the buttons
        view.setListener(controller); //set the click ability to each button

        view.setText(model.getPlayerWins()); //show text when player wins


    }
}