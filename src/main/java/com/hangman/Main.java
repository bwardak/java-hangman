package com.hangman;

import com.hangman.display.Display;
import com.hangman.display.Game;
import com.hangman.display.Start;


public class Main {
    public static void main(String[] args) {
        Display landing = new Display();
        System.out.println(landing.gameTitle());

        Start home = new Start();
        home.greetPlayer();
        home.initiateGame();
        Game gamePage = new Game();

        gamePage.commandAction();
    }
}