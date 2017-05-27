package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.classwork.lesson8.ArrayUtil;
import com.kitcenter.app.homework.lesson9.ArrayGenerator;
import java.util.Scanner;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-26
 */
public class BasicArraysRunner {

    public static void main(String[] args) {

        ArrayGenerator arrayGenerator = new ArrayGenerator();
        ArrayUtil arrayUtil = new ArrayUtil();

        System.out.println("Running task \"a\":");
        int[] arrayOfEven = arrayGenerator.getEvenInRange(2,20);
        arrayUtil.print(arrayOfEven," ");
        arrayUtil.print(arrayOfEven,"\n");

        System.out.println("Running task \"b\":");
        int[] arrayOfOdd = arrayGenerator.getOddInRange(1,99);
        arrayUtil.print(arrayOfOdd," ");
        arrayUtil.printReverse(arrayOfOdd," ");

        System.out.println("");
        System.out.println("Running task \"c\":");
        int[] randomArray = arrayGenerator.fillGeneratedArray(15,0,9);
        arrayUtil.printReverse(randomArray," ");
        System.out.println(arrayGenerator.conutEvenNumbersInArray(randomArray));

        System.out.println("");
        System.out.println("Running task \"d\":");
        int[] anotherRandomArray = arrayGenerator.fillGeneratedArray(15,0,999);
        arrayUtil.printReverse(anotherRandomArray," ");
        System.out.println("Maximum value is: "+arrayUtil.getMax(anotherRandomArray));
        System.out.println("Minimum value is: "+arrayUtil.getMin(anotherRandomArray));

        System.out.println("");
        System.out.println("Running task \"e\":");
        int[][] twoDimArrayOne = arrayGenerator.fillGeneratedArray(8,5,10,99,"");
        arrayUtil.print(twoDimArrayOne);

        System.out.println("");
        System.out.println("Running task \"f***\":");
        int[][] twoDimArrayTwo = arrayGenerator.fillGeneratedArray(8,5,1,999,"");
        arrayUtil.printAlignRight(twoDimArrayTwo);

        System.out.println("");
        System.out.println("Running task \"g***\":");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter random values. To finish the operation type \"exit\":");
        String scanned;
        double sum=0;
        do {
            scanned = scanner.next();
            try {sum = sum + Double.parseDouble(scanned);}
            catch (Exception e) {
                if(!scanned.equals("exit")){System.out.println("wrong input value");}
            }
        }
        while(!scanned.equals("exit"));
        System.out.println("The sum of entered numbers is: " + sum);
    }

}
