package com.kitcenter.app.homework.lesson11;

import com.kitcenter.app.classwork.lesson8.ArrayUtil;

import java.util.Scanner;

import static com.kitcenter.app.homework.lesson11.ArrayParser.ArrayType.*;
import static com.kitcenter.app.homework.lesson11.ArrayParser.SortingDirection.ASCENDING;
import static com.kitcenter.app.homework.lesson11.ArrayParser.SortingDirection.DESCENDING;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-01
 */
public class ArrayParser extends ArrayUtil {

    private String separator = ";";

    public enum ArrayType {
        INTEGER, DOUBLE, CHARACTER, RANDOM
    }
    public enum SortingDirection {
        ASCENDING, DESCENDING
    }
    public ArrayType arrayType;
    private SortingDirection sortingDirection;

    public String getUserArrayInput(){
        System.out.println("Enter the Array. Separator symbol is set to \"" + separator + "\"");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        setArrayType(input);
        System.out.println(arrayType);
        return input;
    }

    private void setArrayType(String input){
        arrayType = RANDOM;
        if(isChar(input)){arrayType = CHARACTER;}
        if(isDouble(input)){arrayType = DOUBLE;}
        if(isInteger(input)){arrayType = INTEGER;}
    }

    private boolean isInteger(String input){
        //String regexpInteger = "([-\\d]+["+ separator +"])*([-\\d]+[" + separator + "]*)";
        String regexpInteger = "([-\\d])*([" + separator + "])([-\\d])*";
        String[] mismatches = input.split(regexpInteger);
        boolean isInteger = false;
        if(mismatches.length==0){isInteger=true;}
        return isInteger;
    }

    private boolean isDouble(String input){
        String regexpDouble = "([-\\d]+[,.]*[-\\d]*[" + separator + "])+([-\\d]+[,.][-\\d]+[" + separator + "])*([-\\d]+[.,]*[-\\d]*[" + separator + "]*)";
        boolean isDouble = input.matches(regexpDouble);
        return isDouble;
    }

    private boolean isChar(String input){
        //String regexpChar = "(.[" + separator + "])+(.)";
        String regexpChar = "((.[" + separator + "])+(.))|([" + separator + "])";
        String[] mismatches = input.split(regexpChar);
        boolean isChar = false;
        if(mismatches.length==0){isChar=true;}
        return isChar;
    }

    public String getAlphabetFromInput(String input){
        System.out.println("Your input contains next alphabet characters:");
        String regexp = "([^a-zA-Z])";
        String alphabet = input.replaceAll(regexp,"");
        return alphabet;
    }

    public void setSeparator(){
        System.out.println("Enter the desired separator text, it should not be: {}[]\\,.\"\'. Default is \";\"");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String illegalSeparators = "{}[]\\,.\"\'";
        if (!illegalSeparators.contains(input)&&input.length()>0) {
            this.separator = input;
        } else {
            System.out.println("Only char may be separator. Setting to deafult \";\"");
        }
    }

    public void setSorting(){
        System.out.println("Enter the desired sorting direction (ASC for ASCENDING and DSC for DESCENDING; default is ASC):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input){
            case "DSC": {sortingDirection = DESCENDING;break;}
            default: sortingDirection = ASCENDING;
        }
        System.out.println("Sorting direction is set to " + sortingDirection);
    }

    private int[] parseToIntArray(String input) {
        String[] array = input.split(String.valueOf(separator));
        int[] inputArray = new int[array.length];
                for(int i=0; i<array.length; i++) {
                    try {
                        inputArray[i]=Integer.valueOf(array[i]);
                    } catch (Exception e) {
                        System.out.println("Skipping \"" + array[i] + "\"");
                    }
                }
        return inputArray;
    }

    private double[] parseToDoubleArray(String input) {
        String[] array = input.split(String.valueOf(separator));
        double[] inputArray = new double[array.length];
                for(int i=0; i<array.length; i++) {
                    try {
                        inputArray[i]=Double.valueOf(array[i]);
                    } catch (Exception e) {
                        System.out.println("Skipping \"" + array[i] + "\"");
                    }
                }
        return inputArray;
    }

    private char[] parseToCharArray(String input) {
        String[] array = input.split(String.valueOf(separator));
        char[] inputArray = new char[array.length];
                for (int i = 0; i < array.length; i++) {
                    if (array[i].length() == 1) {
                        inputArray[i] = array[i].charAt(0);
                    } else {
                        System.out.println("Skipping \"" + array[i] + "\"");
                    }
                }
        return inputArray;
    }

    public StringBuilder sortArray(String input){
        StringBuilder sortedArray = new StringBuilder();
        switch (arrayType){
            case INTEGER:{
                int[] array = parseToIntArray(input);
                array = sortIntArray(array);
                for(int i=0; i<array.length; i++) {
                    sortedArray.append(array[i]);
                    sortedArray.append(separator);
                }
                break;
            }
            case DOUBLE:{
                double[] array = parseToDoubleArray(input);
                array = sortDoubleArray(array);
                for(int i=0; i<array.length; i++) {
                    sortedArray.append(array[i]);
                    sortedArray.append(separator);
                }
                break;
            }
            case CHARACTER:{
                char[] array = parseToCharArray(input);
                array = sortCharArray(array);
                for(int i=0; i<array.length; i++) {
                    sortedArray.append(array[i]);
                    sortedArray.append(separator);
                }
                break;
            }
        }
        return sortedArray;
    }

    private char[] sortCharArray(char[] array){
        boolean swapped = true;
        int j = 0;
        char tmp;

        switch (sortingDirection){
            case ASCENDING:{
                while (swapped) {
                    swapped = false;
                    j++;
                    for (int i = 0; i < array.length - j; i++) {
                        if (array[i] > array[i + 1]) {
                            tmp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = tmp;
                            swapped = true;
                        }
                    }
                }
            }
            case DESCENDING:{
                while (swapped) {
                    swapped = false;
                    j++;
                    for (int i = 0; i < array.length - j; i++) {
                        if (array[i] < array[i + 1]) {
                            tmp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = tmp;
                            swapped = true;
                        }
                    }
                }
            }
        }

        return array;
    }

    private int[] sortIntArray(int[] array){
        boolean swapped = true;
        int j = 0;
        int tmp;

        switch (sortingDirection){
            case ASCENDING:{
                while (swapped) {
                    swapped = false;
                    j++;
                    for (int i = 0; i < array.length - j; i++) {
                        if (array[i] > array[i + 1]) {
                            tmp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = tmp;
                            swapped = true;
                        }
                    }
                }
            }
            case DESCENDING:{
                while (swapped) {
                    swapped = false;
                    j++;
                    for (int i = 0; i < array.length - j; i++) {
                        if (array[i] < array[i + 1]) {
                            tmp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = tmp;
                            swapped = true;
                        }
                    }
                }
            }
        }

        return array;
    }

    private double[] sortDoubleArray(double[] array){
        boolean swapped = true;
        int j = 0;
        double tmp;

        switch (sortingDirection){
            case ASCENDING:{
                while (swapped) {
                    swapped = false;
                    j++;
                    for (int i = 0; i < array.length - j; i++) {
                        if (array[i] > array[i + 1]) {
                            tmp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = tmp;
                            swapped = true;
                        }
                    }
                }
            }
            case DESCENDING:{
                while (swapped) {
                    swapped = false;
                    j++;
                    for (int i = 0; i < array.length - j; i++) {
                        if (array[i] < array[i + 1]) {
                            tmp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = tmp;
                            swapped = true;
                        }
                    }
                }
            }
        }

        return array;
    }

    public void printInputLinesBySeparator(String input){
        System.out.println("The input contains next values, separated by \"" + separator + "\"");
        String separatedLines = input.replaceAll(separator,"\n");
        System.out.println(separatedLines);
    }
}
