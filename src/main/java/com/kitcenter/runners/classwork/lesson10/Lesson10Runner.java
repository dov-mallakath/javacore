package com.kitcenter.runners.classwork.lesson10;

import com.kitcenter.app.classwork.lesson10.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-27
 */
public class Lesson10Runner {
    public static void main(String[] args) {
        String stringToDisplay = "";
        char[] charArrayToString = {'a','b','c','d'};
        stringToDisplay = Arrays.toString(charArrayToString)
                .replace("[","")
                .replace("]","")
                .replace(",","")
                .replace(" ","\n");
        System.out.println(stringToDisplay);

        String stringToDisplayOne = "";
        for (int i=0; i<charArrayToString.length; i++){
            stringToDisplayOne += charArrayToString[i];
        }
        System.out.println(stringToDisplayOne);

        String stringToDisplayTwo = String.valueOf(charArrayToString);
        System.out.println(stringToDisplayTwo);

        int integer = 11;
        double doubleVar = 12.5;
        long longVar = 13;
        boolean booleanVar = true;

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add(String.valueOf(integer));
        listOfStrings.add(String.valueOf(doubleVar));
        listOfStrings.add(String.valueOf(longVar));
        listOfStrings.add(String.valueOf(booleanVar));

        System.out.println(listOfStrings);

        int newInteger = Integer.valueOf(listOfStrings.get(0));
        double newDouble = Double.valueOf(listOfStrings.get(1));
        long newLong = Long.valueOf(listOfStrings.get(2));
        boolean newBoolean = Boolean.valueOf(listOfStrings.get(3));

        System.out.println(newInteger + ", " + newDouble + ", " + newLong + ", " + newBoolean);

        String testOne = "test";
        String testTwo = "test";
        testTwo += "1";
        System.out.println(testOne + " " + testTwo);

        String objString = new String("KT");
        String poolString = "KT";
        String stringIntern = objString.intern();
        System.out.println(poolString==stringIntern);

        String freeText = "3,5,6,7,8,10";
        String freeTextOne = "3,5,6,7,9";
        String[] split = freeText.split(",");
        System.out.println(split[2]);

        int i = freeText.compareTo(freeTextOne);
        System.out.println(i);

        int i1 = freeText.hashCode();
        System.out.println(i1);

        StringUtils stringUtils = new StringUtils();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();


        StringBuilder builder = new StringBuilder("sks");
        String c = "sks";
        for(long ii=0; ii<100000L; ii++) {
            builder = builder.append(c);
        }
        input=builder.toString();
        long start = System.currentTimeMillis();
        System.out.println(stringUtils.isPalindrome(input));
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        System.out.println(stringUtils.isPalindromeFast(input));
        end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        System.out.println(stringUtils.isPalindromeSuperFast(input));
        end = System.currentTimeMillis();
        System.out.println(end-start);

        int counter = 5;
        Integer autoBoxingLiteral = counter;
        Integer autoBoxing = new Integer(counter);
        int unboxingLiteral = autoBoxingLiteral;
        int unboxing = autoBoxing;

    }
}
