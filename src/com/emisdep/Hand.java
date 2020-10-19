package com.emisdep;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {

    private List<Die> dice = new ArrayList<Die>();

    public Hand(int size) {
        for (int count = 0; count < 5; count++) {
            dice.add(new Die());
        }
    }

    public void rollAllDice(Random rand, List<Integer> integers) {
        for (var die : dice) {
            die.roll(rand);
        }
    }

    public void allDice() {
        for (var die : dice) {
            System.out.println(die.getValue() + "dice");
        }
        System.out.println(("\n"));
    }

    public void redo(Random rand, int pickDie) {
        dice.get(pickDie).roll(rand);
    }

    public void redoPicks(Random rand, List<Integer> choices) {
        for (int pickDie : choices) {
            redo(rand, pickDie);
        }
    }

    public int getDieValue(int pos) {
        return dice.get(pos).getValue();
    }

    public List<Die> getDice() {
        return dice;
    }
}