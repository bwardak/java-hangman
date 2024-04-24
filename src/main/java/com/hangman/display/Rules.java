package com.hangman.display;

public class Rules extends Display {

    public void showRules() {
        dashedLine();
        System.out.println("- A word is selected at random.");
        System.out.println("- A number of dashed lines will appear, each dash representing a letter of the word.");
        System.out.println("- You must guess one letter at the time, or enter a word if you believe you know the answer.");
        System.out.println("- If the letter matches, it will appear in place of a dash.");
        System.out.println("- If you are wrong, you lose a life.");
        System.out.println("- Win: You guess the word correctly.\n-Lose: You run out of lives.");
        emptySpace();
        startActions();
    }
}
