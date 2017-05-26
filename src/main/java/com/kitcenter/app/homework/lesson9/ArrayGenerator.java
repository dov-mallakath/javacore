package com.kitcenter.app.homework.lesson9;

import com.kitcenter.app.homework.lesson6.CountEvenNumbersInRange;

import java.util.Random;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-26
 */
public class ArrayGenerator {

    CountEvenNumbersInRange countEvenNumbersInRange = new CountEvenNumbersInRange();

    public int[] getEvenInRange(int from, int to){
        int[] arrayOfEven = new int[countEvenNumbersInRange.countEvenNumbersInRange(from,to)];
        arrayOfEven[0]=(countEvenNumbersInRange.isEven(from))?from:countEvenNumbersInRange.getNextEven(from);
        for(int i=1; i<arrayOfEven.length; i++){
            arrayOfEven[i]=countEvenNumbersInRange.getNextEven(arrayOfEven[i-1]);
        }
        return arrayOfEven;
    }

    public int[] getOddInRange(int from, int to){
        int arrayLength = (from!=0&&to!=0)?(to - from) - countEvenNumbersInRange.countEvenNumbersInRange(from,to)+1:(to - from) - countEvenNumbersInRange.countEvenNumbersInRange(from,to);
        int[] arrayOfOdd = new int[arrayLength];
        arrayOfOdd[0]=(countEvenNumbersInRange.isEven(from))?countEvenNumbersInRange.getNextEven(from):from;
        for(int i=1; i<arrayOfOdd.length; i++){
            arrayOfOdd[i]=countEvenNumbersInRange.getNextEven(arrayOfOdd[i-1])+1;
        }
        return arrayOfOdd;
    }

    public int conutEvenNumbersInArray(int[] array){
        int counter=0;
        for(int i=0; i<array.length; i++){
            if(countEvenNumbersInRange.isEven(array[i])){counter++;}
        }
        return counter;
    }

    public int[][] fillGeneratedArray(int sizeRows, int sizeColumns, int randomStart, int randomEnd, String oddOrEven){
        int[][] generatedArray = new int[sizeRows][sizeColumns];
        for (int rows = 0; rows<generatedArray.length; rows++){
            for(int columns = 0; columns<generatedArray[rows].length; columns++){
                generatedArray[rows][columns] = generateRandomElement(randomStart, randomEnd, oddOrEven);
            }
        }
        return generatedArray;
    }

    public int[] fillGeneratedArray(int sizeRows, int randomStart, int randomEnd){
        int[] generatedArray = new int[sizeRows];
        for (int rows = 0; rows<generatedArray.length; rows++){
            generatedArray[rows] = generateRandomElement(randomStart, randomEnd);
        }
        return generatedArray;
    }

    private int generateRandomElement(int randomStart, int randomEnd){
        Random random = new Random();
        int element = random.nextInt(randomEnd-randomStart) + randomStart;
        return element;
    }


    private int generateRandomElement(int randomStart, int randomEnd, String oddOrEven){
        int element;
        Random random = new Random();
        switch (oddOrEven.toUpperCase()){
            case "ODD":
                do {
                    element = random.nextInt(randomEnd-randomStart) + randomStart;
                }
                while(element%2==0);
                break;
            case "EVEN":
                do {
                    element = random.nextInt(randomEnd-randomStart) + randomStart;
                }
                while(element%2!=0);
                break;
            default:
                element = random.nextInt(randomEnd-randomStart) + randomStart;
        }
        return element;
    }

    public void printArray(String separator){

    }
}
