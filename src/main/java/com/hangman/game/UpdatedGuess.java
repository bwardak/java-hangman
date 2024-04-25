package com.hangman.game;


import com.hangman.display.Game;

import java.util.ArrayList;
import java.util.Scanner;


public class UpdatedGuess extends  Word{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> compareLettersArr = getLettersArr();
    private ArrayList<String> compareUnderscoreArr = getUnderscoreArr();
    private ArrayList<String> guessedLetters = new ArrayList<>();
    int lives = 7;
    public UpdatedGuess() {
        randomisedWordToGuess();
        wordToUnderscores();
        wordToLetters();
    }

    public void underScoreArrayCurrent() {
        setUnderscoreArr(underscoreArr);
        String underscoreArrJoined = String.join(" ", underscoreArr);
        System.out.println(underscoreArrJoined + " hi");
    }

    public void testCurrentGuess() {
        System.out.println(getUnderscoreArr() + "This ting");
        System.out.println(getLettersArr() + "This ting");
        System.out.println(compareLettersArr);
        System.out.println(compareUnderscoreArr);
        System.out.println(underscoreArr + "UR");
    }

    public void compareLetter() {
        String input = scanner.nextLine();
        if (compareLettersArr.contains(input)) {
            int index = compareLettersArr.indexOf(input);
            compareUnderscoreArr.set(index, input);
            compareLettersArr.set(index, "_");
            System.out.println(compareUnderscoreArr);
            System.out.println(String.join(" ", compareUnderscoreArr));
        } else {
            guessedLetters.add(input);
            updatedStatus();
        }
        victoryCondition();

    }

    public void updatedStatus() {
        System.out.println("Guesses: " + guessedLetters);
        lives--;
        if (lives > 0) {
            System.out.println("Lives: " + lives);
        }
        loseCondition();
    }

    public void victoryCondition() {
        if (compareUnderscoreArr.contains("_")) {
            compareLetter();
        } else {
            System.out.println("YOU WIN!");
        }
    }

    public void loseCondition() {
        if (lives <= 0) {
            System.out.println("YOU LOSE!");
        }
    }
}
