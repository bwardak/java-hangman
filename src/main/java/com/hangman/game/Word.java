package com.hangman.game;

import java.util.ArrayList;

public class Word {

    ArrayList<String> lettersArr = new ArrayList<>();
    ArrayList<String> underscoreArr = new ArrayList<>();
    private String word = "shadow";

    public ArrayList<String> getLettersArr() {
        return lettersArr;
    }

    public void setLettersArr(ArrayList<String> lettersArr) {
        this.lettersArr = lettersArr;
    }

    public ArrayList<String> getUnderscoreArr() {
        return underscoreArr;
    }

    public void setUnderscoreArr(ArrayList<String> underscoreArr) {
        this.underscoreArr = underscoreArr;
    }

    public void wordToLetters() {
        for (int i = 0; i < word.length(); i++) {
            lettersArr.add(word.substring(i, i + 1));
        }
    }

    public void wordToUnderscores() {
        for (int i = 0; i < word.length(); i++) {
            underscoreArr.add("_");
        }
    }
}

