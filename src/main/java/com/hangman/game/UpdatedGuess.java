package com.hangman.game;

import com.hangman.display.Display;
import com.hangman.display.Game;


import com.hangman.display.Game;
import com.hangman.game.HangmanLives;

import java.util.ArrayList;
import java.util.Scanner;


public class UpdatedGuess extends  Word{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> compareLettersArr = getLettersArr();
    private ArrayList<String> compareUnderscoreArr = getUnderscoreArr();
    private ArrayList<String> guessedLetters = new ArrayList<>();
    private String answerDisplay;
    int lives = 8;
    HangmanLives hang = new HangmanLives();
    Display display = new Display();

    public UpdatedGuess() {
        randomisedWordToGuess();
        wordToUnderscores();
        wordToLetters();
    }

    public void underScoreArrayCurrent() {
        setUnderscoreArr(underscoreArr);
        String underscoreArrJoined = String.join(" ", underscoreArr);
        System.out.println("                           " + underscoreArrJoined);
    }

    public void testCurrentGuess() {
        System.out.println(getUnderscoreArr() + "This ting");
        System.out.println(getLettersArr() + "This ting");
        System.out.println(compareLettersArr);
        System.out.println(compareUnderscoreArr);
        System.out.println(underscoreArr + "UR");
    }

    public void compareLetter() {
        if (guessedLetters.isEmpty()) {
            display.dashedLine();
        }
        System.out.println("Enter your guess: ");
        String input = scanner.nextLine().trim().toLowerCase();
        String answer = getWord();
        answerDisplay = getWord();
        if (input.equals(answer)){          // CORRECT GUESS
            compareUnderscoreArr.clear();
            victoryConditionWordGuess();
        } else {
            if (compareLettersArr.contains(input)) {  // ADDED WHILE LOOP TO ADD EVERY INSTANCE OF GUESSED LETTER
                while (compareLettersArr.contains(input)) {
                    int index = compareLettersArr.indexOf(input);
                    compareUnderscoreArr.set(index, input);
                    compareLettersArr.set(index, "_");
                    guessedLetters.add(input);
                }
            } else {
                guessedLetters.add(input);
                lives--;
            }
            updatedStatus();
            System.out.println("                           " + String.join(" ", compareUnderscoreArr));
            display.emptySpace();
            display.dashedLine();
            victoryConditionLetterGuess();
        }
    }

    public void updatedStatus() {
        switch (lives){
            case 7:
                hang.oneWrongGuess();
                break;
            case 6:
                hang.twoWrongGuess();
                break;
            case 5:
                hang.threeWrongGuess();
                break;
            case 4:
                hang.fourWrongGuess();
                break;
            case 3:
                hang.fiveWrongGuess();
                break;
            case 2:
                hang.sixWrongGuess();
                break;
            case 1:
                hang.sevenWrongGuess();
                break;
            case 0:
                hang.eightWrongGuess();
        }
        System.out.println("\nGuesses: " + guessedLetters);
        loseCondition();
        System.out.println("\n \n");
    }

    public void victoryConditionLetterGuess() {
        if (compareUnderscoreArr.contains("_")) {
            compareLetter();
        } else {
            System.out.println("YOU WIN!");
            restartActions();
        }
    }

    public void victoryConditionWordGuess() {
        System.out.println("                           " + answerDisplay);
        System.out.println("GREAT GUESS!");
        restartActions();
    }

    public void loseCondition() {
        if (lives <= 0) {
            System.out.println("CORRECT ANSWER: " + getWord() + "\n");
            System.out.println("YOU LOSE!");
            restartActions();
        }
    }

    public void restartActions() {
        display.dashedLine();
        System.out.println("Restart game? \n");
        System.out.println("0: Yes\n1: No");
        int input = Display.getIntegerInput();
        if (input == 0) {
            gameRestart();
        } else if (input == 1) {
            System.out.println("Thanks for playing :]");
            compareUnderscoreArr.add("_");
        }
    }

    public void gameRestart() {
        lives = 8;
        guessedLetters.clear();
        compareUnderscoreArr.clear();
        compareLettersArr.clear();
        randomisedWordToGuess();
        wordToUnderscores();
        wordToLetters();
        System.out.println("HANGMAN\n \n \n");
        updatedStatus();
        underScoreArrayCurrent();
        compareLetter();
    }
}
