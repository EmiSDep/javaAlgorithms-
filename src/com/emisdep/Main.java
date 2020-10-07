package com.emisdep;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Hand myHand = new Hand(5);

        myHand.rollAllDice(rand);
        System.out.println(myHand.getDice());
        System.out.print(myHand.getDieValue(0) + " ");
        System.out.print(myHand.getDieValue(1) + " ");
        System.out.print(myHand.getDieValue(3) + " ");
        System.out.print("\n");
        myHand.rollAllDice(rand);
        System.out.print(myHand.getDieValue(0) + " ");
        System.out.print(myHand.getDieValue(1) + " ");
        System.out.print(myHand.getDieValue(3) + " ");
        myHand.redo(rand, 1);
        myHand.redo(rand, 3);
        myHand.getDieValue(1);
        myHand.allDice();


    }
}
