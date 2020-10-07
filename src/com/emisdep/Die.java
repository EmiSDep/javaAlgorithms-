package com.emisdep;

import java.util.Random;

public class Die {
    private int numberOfSides = 6;
    private int value;

    public Die() {
    value = 1;
    }

    public void roll(Random rand) {
        value = rand.nextInt(numberOfSides) + 1;
    }

    public int getValue(){
        return value;
    }
}
