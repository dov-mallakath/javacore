package com.kitcenter.homework.lesson5;

import com.kitcenter.app.homework.lesson5.CompareTwoNumbers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-08
 */
public class CompareTwoNumbersTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private CompareTwoNumbers compareTwoNumbers = new CompareTwoNumbers();
    private double valueOne = 4.25;
    private double valueTwo = 4;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void returnBiggerNumberTestBasicOne(){
        String expectedResult = "The bigger number is " + valueOne + System.lineSeparator();
        double resultOne = compareTwoNumbers.returnBiggerNumber(valueOne,valueTwo);
        Assert.assertEquals(valueOne,resultOne,2);
        Assert.assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void returnBiggerNumberTestBasicTwo(){
        String expectedResult = "The bigger number is " + valueOne + System.lineSeparator();
        double resultTwo = compareTwoNumbers.returnBiggerNumber(valueTwo,valueOne);
        Assert.assertEquals(valueOne,resultTwo,2);
        Assert.assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void returnBiggerNumberTestEqual(){
        String expectedResult = "The input numbers are equal" + System.lineSeparator();
        double resultOne = compareTwoNumbers.returnBiggerNumber(valueOne,valueOne);
        Assert.assertEquals(valueOne,resultOne,2);
        Assert.assertEquals(expectedResult, outContent.toString());
    }
}
