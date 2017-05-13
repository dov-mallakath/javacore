package com.kitcenter.runners.classwork.lesson6;

import com.kitcenter.app.homework.lesson6.CountEvenNumbersInRange;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-13
 */
public class CountEvenNumbersInRangeRunner {
    public static void main(String[] args) {
        CountEvenNumbersInRange countEvenNumbersInRange = new CountEvenNumbersInRange();
        int startRange = 0;
        int endRange = 20;
        int result = countEvenNumbersInRange.countEvenNumbersInRange(startRange,endRange);
        System.out.println("in range from "+startRange+" to "+endRange+":");
        System.out.println("Number of Even values in range "+result);
    }
}
