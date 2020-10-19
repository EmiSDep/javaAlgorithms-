package com.emisdep;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Yahtzee.welcome();
        Hand myHand = new Hand(5);
        myHand.rollAllDice(rand, Yahtzee.chooseDice());
        Yahtzee.handRolled(myHand.getDice());
        myHand.rollAllDice(rand, Yahtzee.chooseDice());
        Yahtzee.handRolled(myHand.getDice());
        myHand.rollAllDice(rand, Yahtzee.chooseDice());
    }
}