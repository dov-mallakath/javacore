package com.kitcenter.homework.lesson5;

import com.kitcenter.app.homework.lesson5.IsEvenCheck;
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
public class IsEvenCheckTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private IsEvenCheck isEvenCheck = new IsEvenCheck();
    private double validEven = 4;
    private double validOdd = 3;
    private double invalid = 4.25;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void isEvenTestValidity(){
        String expectedResult = "Variable " +invalid+ " cannot be odd or even - only integers are eligible for the check" + System.lineSeparator();
        boolean result = isEvenCheck.isEven(invalid);
        Assert.assertFalse(result);
        Assert.assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void isEvenTestPositive(){
        String expectedResult = "The input variable is even" + System.lineSeparator();
        boolean result = isEvenCheck.isEven(validEven);
        Assert.assertTrue(result);
        Assert.assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void isEvenTestNegative(){
        String expectedResult = "The input variable is odd" + System.lineSeparator();
        boolean result = isEvenCheck.isEven(validOdd);
        Assert.assertFalse(result);
        Assert.assertEquals(expectedResult, outContent.toString());
    }
}
