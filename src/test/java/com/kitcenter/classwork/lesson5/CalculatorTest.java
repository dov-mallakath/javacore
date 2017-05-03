package com.kitcenter.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-03
 */
public class CalculatorTest {

    private int testNumberOne = 3;
    private int testNumberTwo = 2;
    private Calculator calculator = new Calculator();

    @Test
    public void sumTest() {
        int expectedResult = 5;
        int actualResult = calculator.sum(testNumberOne,testNumberTwo);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void multiplyTest() {
        int expectedResult = 6;
        int actualResult = calculator.multiply(testNumberOne,testNumberTwo);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void substractTest() {
        int expectedResult = 1;
        int actualResult = calculator.substract(testNumberOne,testNumberTwo);
        Assert.assertEquals(expectedResult,actualResult);
    }



}
