package com.kitcenter.app.classwork.lesson5;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-03
 */
public class Calculator {
    public int sum(int numberOne, int numberTwo) {
        int sum = numberOne + numberTwo;
        return sum;
    }

    public int multiply(int numberOne, int numberTwo) {
        int multiply = numberOne * numberTwo;
        return multiply;
    }

    public int substract(int numberOne, int numberTwo) {
        int substract = numberOne - numberTwo;
        return substract;
    }

    public int power(double numberOne, int numberTwo) {
        int power=1;
        for(int iterator=1; iterator<=numberTwo; iterator++){
            power *= numberOne;
        }
        return power;
    }
}
