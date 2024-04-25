package com.hangman.display;

import com.hangman.game.HangmanLives;
import com.hangman.game.UpdatedGuess;
import com.hangman.game.Word;

public class Game extends Display {
    Word word = new Word();
    UpdatedGuess guess = new UpdatedGuess();
    HangmanLives hang = new HangmanLives();
    public void startGame() {
        dashedLine();
        System.out.println("HANGMAN");
        guess.testCurrentGuess();
        guess.underScoreArrayCurrent();
        guess.compareLetter();
        hang.oneWrongGuess();
        hang.twoWrongGuess();
        hang.threeWrongGuess();
        hang.fourWrongGuess();
        hang.fiveWrongGuess();
        hang.sixWrongGuess();
        hang.sevenWrongGuess();
        hang.eightWrongGuess();

        emptySpace();
    }

    public void showRules() {
        dashedLine();
        System.out.println("- A word is selected at random.");
        System.out.println("- A number of dashed lines will appear, each dash representing a letter of the word.");
        System.out.println("- You must guess one letter at the time, or enter a word if you believe you know the answer.");
        System.out.println("- If the letter matches, it will appear in place of a dash.");
        System.out.println("- If you are wrong, you lose a life.");
        System.out.println("- Win: You guess the word correctly.\n- Lose: You run out of lives.");
        emptySpace();
        startActions();
        commandAction();
    }

    public void commandAction() {
        int input = Display.getIntegerInput();
        if (input == 0) {
            startGame();
        } else if (input == 1) {
            showRules();
        }
    }

    public void restartGame() {

    }
}
