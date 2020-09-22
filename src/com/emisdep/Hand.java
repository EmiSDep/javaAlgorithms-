package com.emisdep;

import java.util.ArrayList;
import java.util.Random;

public class Hand {

    private Die[] dice;

    public Hand() {
        dice = new Die[5];
    }
    private void initAll(int sides) {
        for(int i = 1; i < 5; i++) {
            dice[i] = new Die(sides);
        }
    }

    private void rollAllDice(Random rand){
        for (Die i : dice) {
            i.roll(rand);
        }
    }

    public void allDice() {
        for (Die i : dice) {
            System.out.println(i.getValue() + "dice");
        }
        System.out.println(("\n"));
    }

    public void redo(Random rand, int pickDie) {
        if (pickDie > dice.length){
            return;
        }
        dice[pickDie].roll(rand);
    }

    public void redoPicks(Random rand, int[] choices) {
        for (int i : choices) {
            dice[i].roll(rand);
        }
    }



}
