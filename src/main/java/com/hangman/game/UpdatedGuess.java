package com.hangman.game;

import java.util.ArrayList;

public class UpdatedGuess extends  Word{
    ArrayList<String> currentGuess = getUnderscoreArr();

    public ArrayList<String> getCurrentGuess() {
        return currentGuess;
    }

    public void setCurrentGuess(ArrayList<String> currentGuess) {
        this.currentGuess = currentGuess;
    }

    public void testCurrentGuess() {
        wordToUnderscores();

    }
}
