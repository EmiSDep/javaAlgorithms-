package com.emisdep;

import java.util.Random;

public class Die {

    private int numberOfSides;
    private int value;

    public Die() {
        numberOfSides = 0;
        value = 0;
    }

    public Die(int sides) {
        numberOfSides = sides;
        value = 0;
    }

    public int roll() {
        Random rand = new Random();
        value = rand.nextInt(getNumberOfSides() + 1);

        return getValue();
    }

    public void multiroll(int n) {
        int rollCounter = 0;
        while(rollCounter <= n) {
            roll();
            System.out.println("Die: " + getValue());
            rollCounter +=1;
        }
    }
    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getValue() {
        return value;
    }

    public void roll(Random rand) {
    }
}
