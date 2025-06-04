package com.Temaly;

import com.birdbrain.Finch;

//cupid shuffle patented

public class test {
    public static void main(String[] args) {
        //instantiate 
        Finch myFinch = new Finch();
        //array for notes
        int[] notes = {70, 75, 65};

        //to the right sequence
        // plays note, set beaker color to red, moves to the right three times
        myFinch.setTurn("R", 90, 100);

        for (int i = 0; i<3; i++){
            myFinch.playNote(notes[0], 0.5);
            myFinch.setMove("F", 3.55, 100);
            myFinch.setBeak(252, 3, 3);
            myFinch.pause(0.1);
        }
    //to the left sequence
    //plays note, set beaker color to blue, moves to the left two times
        myFinch.playNote(notes[0], 0.5);
        myFinch.setTurn("L", 180, 100);
        for (int i = 0; i<2; i++){
            myFinch.playNote(75, 0.5);
            myFinch.setMove("F", 3.1, 100);
            myFinch.setBeak(3, 107, 252);
            myFinch.pause(0.1);
        }
        //"kick-now-kick" sequence
        //moving back and forth 4 times
        //beak is white

        myFinch.playNote(notes[1], 0.5);
        myFinch.setTurn("R", 90, 50);
        for (int i = 0; i<4; i++){
            myFinch.playNote(notes[1], 0.5);
            if (i%2==0){
            myFinch.setMove("F", 3.7, 100);
            } else{
                myFinch.setMove("B", 3.7, 100);
            }
            myFinch.setBeak(100, 100, 100);
            // myFinch.pause(0.1);
            
        }
// "now walk it by yourself"/ spin sequence
//while playing notes, spins 180 twice
        myFinch.playNote(notes[2], 0.5);
        myFinch.setTurn("R", 180, 100);
        myFinch.playNote(notes[2], 0.5);
        myFinch.setTurn("R", 180, 100);
        myFinch.pause(0.2);
//"down-down-do-your-dance" sequence
//moves back twice and spins 360 (this whole code occurs 4 times)
for (int i = 0; i<4; i++){
    myFinch.setMove("B", 1, 100);
    myFinch.pause(0.1);
    myFinch.setMove("B", 1, 100);
    myFinch.setTurn("L", 360, 100);
    myFinch.pause(0.9);
}

//to the right sequence
        // plays note, set beaker color to red, moves to the right three times
        myFinch.setTurn("R", 90, 100);

        for (int i = 0; i<2; i++){
            myFinch.playNote(notes[0], 0.5);
            myFinch.setMove("F", 3.55, 100);
            myFinch.setBeak(252, 3, 3);
            myFinch.pause(0.1);
        }
    //to the left sequence
    //plays note, set beaker color to blue, moves to the left two times
        myFinch.playNote(notes[0], 0.5);
        myFinch.setTurn("L", 180, 100);
        for (int i = 0; i<3; i++){
            myFinch.playNote(75, 0.5);
            myFinch.setMove("F", 3.1, 100);
            myFinch.setBeak(3, 107, 252);
            myFinch.pause(0.1);
        }
        //"kick-now-kick" sequence
        //moving back and forth 4 times
        //beak is white

        myFinch.playNote(notes[1], 0.5);
        myFinch.setTurn("R", 90, 50);
        for (int i = 0; i<3; i++){
            myFinch.playNote(notes[1], 0.5);
            if (i%2==0){
            myFinch.setMove("F", 3.7, 100);
            } else{
                myFinch.setMove("B", 3.7, 100);
            }
            myFinch.setBeak(100, 100, 100);
            // myFinch.pause(0.1);
            
        }
// "now walk it by yourself"/ spin sequence
//while playing notes, spins 180 twice
        myFinch.playNote(notes[2], 0.5);
        myFinch.setTurn("R", 180, 100);
        myFinch.playNote(notes[2], 0.5);
        myFinch.setTurn("R", 180, 100);
        myFinch.pause(0.2);
        //to the right sequence
        // plays note, set beaker color to red, moves to the right three times
        myFinch.setTurn("R", 90, 100);

        for (int i = 0; i<2; i++){
            myFinch.playNote(notes[0], 0.5);
            myFinch.setMove("F", 3.55, 100);
            myFinch.setBeak(252, 3, 3);
            myFinch.pause(0.1);
        }
        myFinch.pause(0.1);
    //to the left sequence
    //plays note, set beaker color to blue, moves to the left two times
        myFinch.playNote(notes[0], 0.5);
        myFinch.setTurn("L", 180, 100);
        for (int i = 0; i<2; i++){
            myFinch.playNote(75, 0.5);
            myFinch.setMove("F", 3.1, 100);
            myFinch.setBeak(3, 107, 252);
            myFinch.pause(0.1);
        }
        //"kick-now-kick" sequence
        //moving back and forth 4 times
        //beak is white

        myFinch.playNote(notes[1], 0.5);
        myFinch.setTurn("R", 90, 50);
        for (int i = 0; i<3; i++){
            myFinch.playNote(notes[1], 0.5);
            if (i%2==0){
            myFinch.setMove("F", 3.7, 100);
            } else{
                myFinch.setMove("B", 3.7, 100);
            }
            myFinch.setBeak(100, 100, 100);
            // myFinch.pause(0.1);
            
        }
// "now walk it by yourself"/ spin sequence
//while playing notes, spins 180 twice
        myFinch.playNote(notes[2], 0.5);
        myFinch.setTurn("R", 180, 100);
        myFinch.playNote(notes[2], 0.5);
        myFinch.setTurn("R", 180, 100);
        myFinch.pause(0.2);

//ends the code
        myFinch.stopAll();
        myFinch.disconnect();
    }
}