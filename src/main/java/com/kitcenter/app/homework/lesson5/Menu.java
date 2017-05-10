package com.kitcenter.app.homework.lesson5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-08
 */
public class Menu {
    private static List<String> menuItem = Arrays.asList(
            "Check if three numbers could be sizes of sides of right angled triangle",
            "Check if a number is even or odd",
            "Compare two numbers");

    private void displayMenu(){
        System.out.println();
        System.out.println("Menu:");
        System.out.println("Select what class U wish to execute by entering it's list number (e.g. \"2\") and pressing \"enter\"");
        System.out.println("(To exit program type \"quit\" and press \"enter\")");
        for (int iterator = 1; iterator <= menuItem.size(); iterator++) {
            System.out.println(iterator + ": " + menuItem.get(iterator-1));
        }
    }

    private void runTriangleSidesCheck(){
        TriangleSidesCheck triangleSidesCheck = new TriangleSidesCheck();
        triangleSidesCheck.triangleSidesCheck(UserInputData.setBundleOfVariables(3));
    }

    private void runIsEvenCheck(){
        IsEvenCheck isEvenCheck = new IsEvenCheck();
        isEvenCheck.isEven(UserInputData.setVariable());
    }

    private void runCompareTwoNumbers(){
        CompareTwoNumbers compareTwoNumbers = new CompareTwoNumbers();
        compareTwoNumbers.returnBiggerNumber(UserInputData.setVariable(),UserInputData.setVariable());

    }

    private String getNextCommand(){
        Scanner scanner = new Scanner(System.in);
        //return scanner.next();
        return scanner.nextLine();
    }

    public void commandParser(){
        boolean quit = false;
        while (!quit) {
            displayMenu();
            String command = getNextCommand();
            switch (command) {
                case "1":
                    runTriangleSidesCheck();
                    break;
                case "2":
                    runIsEvenCheck();
                    break;
                case "3":
                    runCompareTwoNumbers();
                    break;
                case "quit":
                    quit = true;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid command, please try again...");
                    break;
            }
        }

    }


}
