package com.kitcenter.app.homework.lesson5;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-08
 */
public class CompareTwoNumbers {

    public double returnBiggerNumber(double numberOne, double numberTwo){
        double biggerOne = numberOne >= numberTwo ? numberOne : numberTwo;
        if (numberOne == numberTwo) {
            System.out.println("The input numbers are equal");
        } else {
            System.out.println("The bigger number is " + biggerOne);
        }
        return biggerOne;
    }
}
