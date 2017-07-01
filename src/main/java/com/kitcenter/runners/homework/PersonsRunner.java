package com.kitcenter.runners.homework;

import com.kitcenter.app.homework.lesson17.Persons;
import com.kitcenter.app.homework.lesson17.ThePersonGame;

import java.util.Scanner;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public class PersonsRunner {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ThePersonGame thePersonGame = new ThePersonGame();
        Persons nextPerson = thePersonGame.getNexPerson();
        System.out.println("The Game have been started!");
        System.out.println("It cannot be stopped until winned or person list becomes empty.");
        System.out.println("To win - collect 3 correct answers.");
        while (nextPerson!=null){

            System.out.println("Guess the birthday of " + nextPerson.getName());
            System.out.print("Enter your answer in yyyy-MM-dd format: ");
            String answerDate = scanner.nextLine();
            System.out.print("Guess if this person still alive (yes/no): ");
            String answerIsAlive = scanner.nextLine();
            boolean isAlive;
            if(answerIsAlive.toUpperCase().equals("YES")){isAlive=true;}else{isAlive=false;}
            boolean response = thePersonGame.isResponseCorrect(nextPerson,answerDate,isAlive);
            if(response){
                System.out.println("Your answers are correct! Strange... Correct answers for now: " + thePersonGame.getCorrectCount());
            }else{
                System.out.println("You are wrong, nothing unexpected. Correct answers for now: " + thePersonGame.getCorrectCount());
            }
            if(thePersonGame.isWinner()){
                System.out.println("Nooo, you guessed three times correctly and WIN THE GAME! The game is over... But only for now...");
            }
            nextPerson = thePersonGame.getNexPerson();
            if(nextPerson==null&&!thePersonGame.isWinner()){
                System.out.println("Persons are over - LOOOOOOOOOOOOOOOOOOOOOOOOOOOSEEEEEEEEEEEEEEEEEEEEER!!!");
            }
        }

    }

}
