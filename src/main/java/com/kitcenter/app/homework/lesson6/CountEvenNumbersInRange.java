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
}
