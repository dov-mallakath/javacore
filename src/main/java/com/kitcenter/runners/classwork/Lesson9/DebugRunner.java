package com.kitcenter.runners.classwork.Lesson9;
import java.util.Random;
/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-24
 */
public class DebugRunner {

    public static void main(String[] args) {
        System.out.println("testing \t the tabulation");
        System.out.println("testing \b the backspace");
        System.out.println("testing \n the new line");
        System.out.println("testing \r the carriage return");
        System.out.println("testing \' the quote");
        System.out.println("testing \" the double quote");
        System.out.println("testing \\ the backslash");

        int a = 5;
        int b = 10;
        int bigger = a>b ? printNumber(a):printNumber(b);
        //System.out.println(bigger);


        Random random = new Random();
        int[] ints = new int[10];

        for (int i=0; i<ints.length; i++){
            ints[i]=random.nextInt();
        }

        int aa=5;
        int bb=6;
        if(aa>bb){
            System.out.println(aa);
        }

    }

    public static int printNumber(int number){
        System.out.println(number);
        return number;
    }

}
