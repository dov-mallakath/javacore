package com.kitcenter.app.homework.lesson6;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-13
 */
public class CountEvenNumbersInRange {

    public int countEvenNumbersInRange(int startRange, int endRange){
        int evenNumbersQuantity=0;
        for (int iterator=startRange; iterator<=endRange; iterator++){
            if (iterator%2==0&&iterator!=0) {evenNumbersQuantity++;}
        }
        return evenNumbersQuantity;
    }

    public boolean isEven(int number){
        boolean result = (number%2==0&&number!=0)?true:false;
        return result;
    }

    public int getNextEven(int number){
        int nextEven = (isEven(number))? number+2 : number+1;
        return nextEven;
    }
}
