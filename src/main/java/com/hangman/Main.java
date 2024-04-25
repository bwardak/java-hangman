package com.hangman;

import com.hangman.display.Display;
import com.hangman.display.Game;
import com.hangman.display.Start;


public class Main {
    public static void main(String[] args) {
        // object for run page
        Display landing = new Display();
        // welcome message
        System.out.println(landing.gameTitle());

        // Home screen for rules or start game
        Start home = new Start();
        home.greetPlayer();
        home.initiateGame();
        Game gamePage = new Game();

        // Whether rules or start game
        gamePage.commandAction();
    }
}