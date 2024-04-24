package com.hangman.game;


import java.util.ArrayList;
import java.util.Scanner;

public class UpdatedGuess extends  Word{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> compareLettersArr = getLettersArr();
    private ArrayList<String> compareUnderscoreArr = getUnderscoreArr();
    String guessedLetters = "";
    int lives = 7;
    public UpdatedGuess() {
        wordToUnderscores();
        wordToLetters();
    }

    public void testCurrentGuess() {
        System.out.println(getUnderscoreArr() + "This ting");
        System.out.println(getLettersArr() + "This ting");
        System.out.println(compareLettersArr);
        System.out.println(compareUnderscoreArr);
    }

    public void compareLetter() {
        String input = scanner.nextLine();
        if (compareLettersArr.contains(input)) {
            int index = compareLettersArr.indexOf(input);
            compareUnderscoreArr.set(index, input);
            System.out.println(compareUnderscoreArr);
            System.out.println(String.join(" ", compareUnderscoreArr));
        } else {

            guessedLetters += (input + " ");
            System.out.println("Guesses: " + guessedLetters);
            System.out.println("Lives: " + --lives);
        }
        if (compareUnderscoreArr.contains("_")) {
            compareLetter();
        } else {
            System.out.println("YOU WIN!");
        }
    }


}
