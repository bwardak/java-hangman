package com.hangman.display;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Display {
    private static Scanner scanner = new Scanner(System.in);
    private String title = "\nHANGMAN by Baheer \n";
    private String currentPage;
    private ArrayList<String> pageCommands = new ArrayList<>();



    public Scanner getScanner() {
        return scanner;
    }

    public String gameTitle() {
        return title;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }


    public void addCommand(String... commands) {
        pageCommands.addAll(Arrays.asList(commands));
    }

    public void printPageCommands() {
        if (pageCommands.isEmpty()) {
            System.out.println("No commands available");
        } else {
            System.out.println("Perform an action: ");
            for (int i = 0; i < pageCommands.size(); i++) {
                System.out.println("  " + i + ": " + pageCommands.get(i));
            }
        }
    }

    public void dashedLine() {
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
    }

    public void emptySpace() {
        System.out.println("\n\n\n");
    }

    public static int getIntegerInput() {
        System.out.println("Enter a number: ");
        int intInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\n");
        return intInput;
    }

    public void startActions() {
        dashedLine();
        System.out.println("Choose an action... \n");
        addCommand("Start game", "Rules");
        printPageCommands();
        emptySpace();
    }
}
