package com.hangman.display;

import java.util.Scanner;

public class Start extends Display{

    public void greetPlayer() {
        System.out.println("Welcome to my Hangman game! Press Enter Key to initiate game... \n");
    }

    public void initiateGame() {
        Scanner scanner = getScanner();
        scanner.nextLine();
        startActions();
    }
}
