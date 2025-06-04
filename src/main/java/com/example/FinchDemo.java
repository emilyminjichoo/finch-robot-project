package com.example;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        myFinch.playNote(60,0.5);

        for (int i = 0; i < 10; i++) {
            myFinch.setBeak(100, 100, 100);
            myFinch.pause(1);
            myFinch.setMove("Forward", 10.0, 50.0);
            myFinch.setBeak(0, 0, 0);
            myFinch.pause(1);
        }
        myFinch.playNote(100, 16);

        myFinch.stopAll();
        myFinch.disconnect();
    }
}