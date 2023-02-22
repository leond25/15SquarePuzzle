package com.example.myapplication;

import android.view.View;

/*
 * Author: David Leon
 * Date: 2/21/2023
 *
 *
 */

public class SquareController implements View.OnClickListener
{
    private SquareView view; //declare view object for the buttons
    private SquareModel model; //declare model object for the buttons

    public SquareController(SquareModel m, SquareView v)
    {
        model = m; //initialize model
        view = v; //initialize view
    }


    /*
     * This method checks for adjacent squares that are available (invisible)
     * and it moves the button to the available space
     *
     * This method also checks for when the player wins
     *
     * This method also checks for when the player clicks the reset button
     */
    public void onClick(View v) {

        switch(v.getId()) { //check which button user clicks
            case R.id.b_11: // if user clicks button (0,0)
                if (view.buttons[0][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[0][0].setVisibility(View.INVISIBLE);
                    view.buttons[0][1].setVisibility(View.VISIBLE); //move there
                    String buttonText1 = (String) view.buttons[0][0].getText();
                    view.buttons[0][1].setText(buttonText1); //and move text there
                } else if (view.buttons[1][0].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[0][0].setVisibility(View.INVISIBLE);
                    view.buttons[1][0].setVisibility(View.VISIBLE); //move there
                    String buttonText2 = (String) view.buttons[0][0].getText();
                    view.buttons[1][0].setText(buttonText2); //and move text there
                }
                break;
            case R.id.b_12: // if user clicks button (0,1)
                if (view.buttons[0][0].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[0][1].setVisibility(View.INVISIBLE);
                    view.buttons[0][0].setVisibility(View.VISIBLE); //move there
                    String buttonText3 = (String) view.buttons[0][1].getText();
                    view.buttons[0][0].setText(buttonText3); //and move text there
                } else if (view.buttons[1][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[0][1].setVisibility(View.INVISIBLE);
                    view.buttons[1][1].setVisibility(View.VISIBLE); //move there
                    String buttonText4 = (String) view.buttons[0][1].getText();
                    view.buttons[1][1].setText(buttonText4); //and move text there
                } else if (view.buttons[0][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[0][1].setVisibility(View.INVISIBLE);
                    view.buttons[0][2].setVisibility(View.VISIBLE); //move there
                    String buttonText5 = (String) view.buttons[0][1].getText();
                    view.buttons[0][2].setText(buttonText5); //and move text there
                }
                break;
            case R.id.b_13: // if user clicks button (0,2)
                if (view.buttons[0][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[0][2].setVisibility(View.INVISIBLE);
                    view.buttons[0][1].setVisibility(View.VISIBLE); //move there
                    String buttonText6 = (String) view.buttons[0][2].getText();
                    view.buttons[0][1].setText(buttonText6); //and move text there
                } else if (view.buttons[1][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[0][2].setVisibility(View.INVISIBLE);
                    view.buttons[1][2].setVisibility(View.VISIBLE); //move there
                    String buttonText7 = (String) view.buttons[0][2].getText();
                    view.buttons[1][2].setText(buttonText7); //and move text there
                } else if (view.buttons[0][3].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[0][2].setVisibility(View.INVISIBLE);
                    view.buttons[0][3].setVisibility(View.VISIBLE); //move there
                    String buttonText8 = (String) view.buttons[0][2].getText();
                    view.buttons[0][3].setText(buttonText8); //and move text there
                }
                break;
            case R.id.b_14: // if user clicks button (0,3)
                if (view.buttons[0][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[0][3].setVisibility(View.INVISIBLE);
                    view.buttons[0][2].setVisibility(View.VISIBLE); //move there
                    String buttonText9 = (String) view.buttons[0][3].getText();
                    view.buttons[0][2].setText(buttonText9); //and move text there
                } else if (view.buttons[1][3].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[0][3].setVisibility(View.INVISIBLE);
                    view.buttons[1][3].setVisibility(View.VISIBLE); //move there
                    String buttonText10 = (String) view.buttons[0][3].getText();
                    view.buttons[1][3].setText(buttonText10); //and move text there
                }
                break;
            case R.id.b_21: // if user clicks button (1,0)
                if (view.buttons[0][0].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][0].setVisibility(View.INVISIBLE);
                    view.buttons[0][0].setVisibility(View.VISIBLE); //move there
                    String buttonText11 = (String) view.buttons[1][0].getText();
                    view.buttons[0][0].setText(buttonText11); //and move text there
                } else if (view.buttons[1][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][0].setVisibility(View.INVISIBLE);
                    view.buttons[1][1].setVisibility(View.VISIBLE); //move there
                    String buttonText12 = (String) view.buttons[1][0].getText();
                    view.buttons[1][1].setText(buttonText12); //and move text there
                }
                else if (view.buttons[2][0].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][0].setVisibility(View.INVISIBLE);
                    view.buttons[2][0].setVisibility(View.VISIBLE); //move there
                    String buttonText13 = (String) view.buttons[1][0].getText();
                    view.buttons[2][0].setText(buttonText13); //and move text there
                }
                break;
            case R.id.b_22: // if user clicks button (1,1)
                if (view.buttons[1][0].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][1].setVisibility(View.INVISIBLE);
                    view.buttons[1][0].setVisibility(View.VISIBLE); //move there
                    String buttonText14 = (String) view.buttons[1][1].getText();
                    view.buttons[1][0].setText(buttonText14); //and move text there
                } else if (view.buttons[0][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][1].setVisibility(View.INVISIBLE);
                    view.buttons[0][1].setVisibility(View.VISIBLE); //move there
                    String buttonText15 = (String) view.buttons[1][1].getText();
                    view.buttons[0][1].setText(buttonText15); //and move text there
                } else if (view.buttons[2][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][1].setVisibility(View.INVISIBLE);
                    view.buttons[2][1].setVisibility(View.VISIBLE); //move there
                    String buttonText16 = (String) view.buttons[1][1].getText();
                    view.buttons[2][1].setText(buttonText16); //and move text there
                } else if (view.buttons[1][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][1].setVisibility(View.INVISIBLE);
                    view.buttons[1][2].setVisibility(View.VISIBLE); //move there
                    String buttonText17 = (String) view.buttons[1][1].getText();
                    view.buttons[1][2].setText(buttonText17); //and move text there
                }
                break;
            case R.id.b_23: // if user clicks button (1,2)
                if(view.buttons[1][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][2].setVisibility(View.INVISIBLE);
                    view.buttons[1][1].setVisibility(View.VISIBLE); //move there
                    String buttonText18 = (String) view.buttons[1][2].getText();
                    view.buttons[1][1].setText(buttonText18); //and move text there
                }
                else if (view.buttons[0][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][2].setVisibility(View.INVISIBLE);
                    view.buttons[0][2].setVisibility(View.VISIBLE); //move there
                    String buttonText19 = (String) view.buttons[1][2].getText();
                    view.buttons[0][2].setText(buttonText19); //and move text there
                }
                else if (view.buttons[2][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][2].setVisibility(View.INVISIBLE);
                    view.buttons[2][2].setVisibility(View.VISIBLE); //move there
                    String buttonText20 = (String) view.buttons[1][2].getText();
                    view.buttons[2][2].setText(buttonText20); //and move text there
                }
                else if (view.buttons[1][3].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][2].setVisibility(View.INVISIBLE);
                    view.buttons[1][3].setVisibility(View.VISIBLE); //move there
                    String buttonText21 = (String) view.buttons[1][2].getText();
                    view.buttons[1][3].setText(buttonText21); //and move text there
                }
                break;
            case R.id.b_24: // if user clicks button (1,3)
                if(view.buttons[1][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][3].setVisibility(View.INVISIBLE);
                    view.buttons[1][2].setVisibility(View.VISIBLE); //move there
                    String buttonText22 = (String) view.buttons[1][3].getText();
                    view.buttons[1][2].setText(buttonText22); //and move text there
                }
                else if (view.buttons[0][3].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][3].setVisibility(View.INVISIBLE);
                    view.buttons[0][3].setVisibility(View.VISIBLE); //move there
                    String buttonText23 = (String) view.buttons[1][3].getText();
                    view.buttons[0][3].setText(buttonText23); //and move text there
                }
                else if (view.buttons[2][3].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[1][3].setVisibility(View.INVISIBLE);
                    view.buttons[2][3].setVisibility(View.VISIBLE); //move there
                    String buttonText24 = (String) view.buttons[1][3].getText();
                    view.buttons[2][3].setText(buttonText24); //and move text there
                }
                break;
            case R.id.b_31: // if user clicks button (2,0)
                if (view.buttons[1][0].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][0].setVisibility(View.INVISIBLE);
                    view.buttons[1][0].setVisibility(View.VISIBLE); //move there
                    String buttonText25 = (String) view.buttons[2][0].getText();
                    view.buttons[1][0].setText(buttonText25); //and move text there
                } else if (view.buttons[2][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][0].setVisibility(View.INVISIBLE);
                    view.buttons[2][1].setVisibility(View.VISIBLE); //move there
                    String buttonText26 = (String) view.buttons[2][0].getText();
                    view.buttons[2][1].setText(buttonText26); //and move text there
                }
                else if (view.buttons[3][0].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][0].setVisibility(View.INVISIBLE);
                    view.buttons[3][0].setVisibility(View.VISIBLE); //move there
                    String buttonText27 = (String) view.buttons[2][0].getText();
                    view.buttons[3][0].setText(buttonText27); //and move text there
                }
                break;
            case R.id.b_32: // if user clicks button (2,1)
                if (view.buttons[2][0].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][1].setVisibility(View.INVISIBLE);
                    view.buttons[2][0].setVisibility(View.VISIBLE); //move there
                    String buttonText28 = (String) view.buttons[2][1].getText();
                    view.buttons[2][0].setText(buttonText28); //and move text there
                } else if (view.buttons[1][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][1].setVisibility(View.INVISIBLE);
                    view.buttons[1][1].setVisibility(View.VISIBLE); //move there
                    String buttonText29 = (String) view.buttons[2][1].getText();
                    view.buttons[1][1].setText(buttonText29); //and move text there
                } else if (view.buttons[3][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][1].setVisibility(View.INVISIBLE);
                    view.buttons[3][1].setVisibility(View.VISIBLE); //move there
                    String buttonText30 = (String) view.buttons[2][1].getText();
                    view.buttons[3][1].setText(buttonText30); //and move text there
                } else if (view.buttons[2][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][1].setVisibility(View.INVISIBLE);
                    view.buttons[2][2].setVisibility(View.VISIBLE); //move there
                    String buttonText31 = (String) view.buttons[2][1].getText();
                    view.buttons[2][2].setText(buttonText31); //and move text there
                }
                break;
            case R.id.b_33: // if user clicks button (2,2)
                if(view.buttons[2][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][2].setVisibility(View.INVISIBLE);
                    view.buttons[2][1].setVisibility(View.VISIBLE); //move there
                    String buttonText32 = (String) view.buttons[2][2].getText();
                    view.buttons[2][1].setText(buttonText32); //and move text there
                }
                else if (view.buttons[1][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][2].setVisibility(View.INVISIBLE);
                    view.buttons[1][2].setVisibility(View.VISIBLE); //move there
                    String buttonText33 = (String) view.buttons[2][2].getText();
                    view.buttons[1][2].setText(buttonText33); //and move text there
                }
                else if (view.buttons[3][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][2].setVisibility(View.INVISIBLE);
                    view.buttons[3][2].setVisibility(View.VISIBLE); //move there
                    String buttonText34 = (String) view.buttons[2][2].getText();
                    view.buttons[3][2].setText(buttonText34); //and move text there
                }
                else if (view.buttons[2][3].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][2].setVisibility(View.INVISIBLE);
                    view.buttons[2][3].setVisibility(View.VISIBLE); //move there
                    String buttonText35 = (String) view.buttons[2][2].getText();
                    view.buttons[2][3].setText(buttonText35); //and move text there
                }
                break;
            case R.id.b_34: // if user clicks button (2,3)
                if(view.buttons[1][3].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][3].setVisibility(View.INVISIBLE);
                    view.buttons[1][3].setVisibility(View.VISIBLE); //move there
                    String buttonText36 = (String) view.buttons[2][3].getText();
                    view.buttons[1][3].setText(buttonText36); //and move text there
                }
                else if (view.buttons[2][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][3].setVisibility(View.INVISIBLE);
                    view.buttons[2][2].setVisibility(View.VISIBLE); //move there
                    String buttonText37 = (String) view.buttons[2][3].getText();
                    view.buttons[2][2].setText(buttonText37); //and move text there
                }
                else if (view.buttons[3][3].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[2][3].setVisibility(View.INVISIBLE);
                    view.buttons[3][3].setVisibility(View.VISIBLE); //move there
                    String buttonText38 = (String) view.buttons[2][3].getText();
                    view.buttons[3][3].setText(buttonText38); //and move text there
                }
                break;
            case R.id.b_41: // if user clicks button (3,0)
                if (view.buttons[2][0].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[3][0].setVisibility(View.INVISIBLE);
                    view.buttons[2][0].setVisibility(View.VISIBLE); //move there
                    String buttonText39 = (String) view.buttons[3][0].getText();
                    view.buttons[2][0].setText(buttonText39); //and move text there
                } else if (view.buttons[3][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[3][0].setVisibility(View.INVISIBLE);
                    view.buttons[3][1].setVisibility(View.VISIBLE); //move there
                    String buttonText40 = (String) view.buttons[3][0].getText();
                    view.buttons[3][1].setText(buttonText40); //and move text there
                }
                break;
            case R.id.b_42: // if user clicks button (3,1)
                if (view.buttons[3][0].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[3][1].setVisibility(View.INVISIBLE);
                    view.buttons[3][0].setVisibility(View.VISIBLE); //move there
                    String buttonText41 = (String) view.buttons[3][1].getText();
                    view.buttons[3][0].setText(buttonText41); //and move text there
                } else if (view.buttons[2][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[3][1].setVisibility(View.INVISIBLE);
                    view.buttons[2][1].setVisibility(View.VISIBLE); //move there
                    String buttonText42 = (String) view.buttons[3][1].getText();
                    view.buttons[2][1].setText(buttonText42); //and move text there
                } else if (view.buttons[3][2].getVisibility() == View.INVISIBLE) { //if space available

                    view.buttons[3][1].setVisibility(View.INVISIBLE);
                    view.buttons[3][2].setVisibility(View.VISIBLE); //move there
                    String buttonText43 = (String) view.buttons[3][1].getText();
                    view.buttons[3][2].setText(buttonText43); //and move text there
                }
                break;
            case R.id.b_43: // if user clicks button (3,2)
                if (view.buttons[3][1].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[3][2].setVisibility(View.INVISIBLE);
                    view.buttons[3][1].setVisibility(View.VISIBLE); //move there
                    String buttonText44 = (String) view.buttons[3][2].getText();
                    view.buttons[3][1].setText(buttonText44); //and move text there
                } else if (view.buttons[2][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[3][2].setVisibility(View.INVISIBLE);
                    view.buttons[2][2].setVisibility(View.VISIBLE); //move there
                    String buttonText45 = (String) view.buttons[3][2].getText();
                    view.buttons[2][2].setText(buttonText45); //and move text there
                } else if (view.buttons[3][3].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[3][2].setVisibility(View.INVISIBLE);
                    view.buttons[3][3].setVisibility(View.VISIBLE); //move there
                    String buttonText46 = (String) view.buttons[3][2].getText();
                    view.buttons[3][3].setText(buttonText46); //and move text there
                }
                break;
            case R.id.b_44: // if user clicks button (3,3)
                if (view.buttons[3][2].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[3][3].setVisibility(View.INVISIBLE);
                    view.buttons[3][2].setVisibility(View.VISIBLE); //move there
                    String buttonText47 = (String) view.buttons[3][3].getText();
                    view.buttons[3][2].setText(buttonText47); //and move text there
                } else if (view.buttons[2][3].getVisibility() == View.INVISIBLE) { //if space available
                    view.buttons[3][3].setVisibility(View.INVISIBLE);
                    view.buttons[2][3].setVisibility(View.VISIBLE); //move there
                    String buttonText48 = (String) view.buttons[3][3].getText();
                    view.buttons[2][3].setText(buttonText48); //and move text there
                }

        }
        if (v.getId() == R.id.b__reset) { //if user clicks reset button
          view.shuffleButtons(); //shuffle the squares
          view.buttonDefaultColor(); //reset the squares to color blue
          view.playerWins.setVisibility(View.INVISIBLE); //make the winning text disappear
        }

        boolean result = view.findResult(); //check the square pattern

        if (result) { //if the player did win
            view.playerWins.setVisibility(View.VISIBLE); //let the user know they won
            view.winnerIndication(); //let all the buttons turn green when they won
        }
    }


}

