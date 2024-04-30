package com.hangman.game;

import java.util.ArrayList;

public class HangmanLives {

    private ArrayList<String> hangman = new ArrayList<>();

    public void oneWrongGuess() {
        hangman.add("\n\n_______");
        System.out.println(hangman.get(0));
    }

    public void twoWrongGuess() {
        hangman.set(0, "   |\n   |\n   |\n   |\n   |\n___|___");
        System.out.println(hangman.get(0));
    }

    public void threeWrongGuess() {
        hangman.set(0, "   ----------\n   |/\n   |\n   |\n   |\n   |\n   |\n___|___");
        System.out.println(hangman.get(0));
    }

    public void fourWrongGuess() {
        hangman.set(0, "   ----------\n   |/       |\n   |\n   |\n   |\n   |\n   |\n___|___");
        System.out.println(hangman.get(0));
    }

    public void fiveWrongGuess() {
        hangman.set(0, "   ----------\n   |/       |\n   |       (_)\n   |\n   |\n   |\n   |\n___|___");
        System.out.println(hangman.get(0));
    }

    public void sixWrongGuess() {
        hangman.set(0, "   ----------\n   |/       |\n   |       (_)\n   |        |\n   |        |\n   |\n   |\n___|___");
        System.out.println(hangman.get(0));
    }

    public void sevenWrongGuess() {
        hangman.set(0, "   ----------\n   |/       |\n   |       (_)\n   |       \\|/\n   |        |\n   |\n   |\n___|___");
        System.out.println(hangman.get(0));
    }

    public void eightWrongGuess() {
        hangman.set(0, "   ----------\n   |/       |\n   |       (_)\n   |       \\|/\n   |        |\n   |       / \\\n   |\n___|___");
        System.out.println(hangman.get(0));
    }
}
