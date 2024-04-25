package com.hangman.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static com.hangman.game.WordUtils.*;

public class Word {

    private Scanner scanner = new Scanner(System.in);
    ArrayList<String> lettersArr = new ArrayList<>();
    ArrayList<String> underscoreArr = new ArrayList<>();
    private String word = "";

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

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void randomisedWordToGuess() {
        setWord(generateWord());
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

