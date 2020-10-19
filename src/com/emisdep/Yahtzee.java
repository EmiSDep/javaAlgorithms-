package com.emisdep;

import java.util.ArrayList;
import java.util.List;

public class Yahtzee extends Console{
    static public void welcome() {
        welcome("Yahtzee");
    }

    static public void handRolled(List<Die> dice) {
        for (Die die : dice) {
            System.out.print(die.getValue() + " ");
        }
    }

    static public int chooseDie() {
        System.out.println("Choose die to reroll 1-5: ");
        String input = scanner.next();
        return Integer.parseInt(input) -1;
    }

    static public List<Integer> chooseDice() {
        System.out.println("Choose the dice you want to reroll 1-5 : ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        List<Integer> choices = new ArrayList<Integer>();
        for (String choice : inputArray) {
            choices.add(Integer.parseInt(choice)-1);
        }
        return choices;
    }
}