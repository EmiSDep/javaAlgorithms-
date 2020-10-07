package com.emisdep;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Hand myHand = new Hand(5);

        //initial dice rolls
        myHand.rollAllDice(rand);
        System.out.println("Dice 1: " + myHand.getDieValue(0) + "\n");
        System.out.println("Dice 2: " + myHand.getDieValue(1) + "\n");
        System.out.println("Dice 3: " + myHand.getDieValue(2) + "\n");
        System.out.println("Dice 4: " + myHand.getDieValue(3) + "\n");
        System.out.println("Dice 5: " + myHand.getDieValue(4) + "\n");

        //getting user input on which to reroll
        Scanner myScan = new Scanner(System.in);
        System.out.println("Which dice would you like to reroll?");

        int reroll = myScan.nextInt();

        //first reroll
        myHand.redo(rand, reroll);
        System.out.println("Dice " + reroll + " new result: " + myHand.getDieValue(reroll) + "\n");

        //second reroll
        System.out.println("Choose another dice to reroll.");
        int reroll2 = myScan.nextInt();

        myHand.redo(rand, reroll2);
        System.out.println("Dice " + reroll2 + " new result: " + myHand.getDieValue(reroll2) + " ");
    }
}