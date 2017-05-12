package com.kitcenter.homework.lesson5;

import com.kitcenter.app.classwork.lesson5.CircleArea;
import com.kitcenter.runners.homework.lesson5.MenuRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-06
 */
public class CircleAreaTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void calculateTest(){
        double radius = 2;
        double expectedResult = 12.566370614359172;
        double result = CircleArea.calculate(radius);
        Assert.assertEquals(expectedResult,result,7);
    }

    @Test
    public void positiveCalculateBiggerTest(){
        double radiusOne = 4;
        double radiusTwo = 3;
        boolean result = CircleArea.calculateBigger(radiusOne,radiusTwo);
        Assert.assertTrue(result);
    }

    @Test
    public void negativeCalculateBiggerTest(){
        double radiusOne = 3;
        double radiusTwo = 4;
        boolean result = CircleArea.calculateBigger(radiusOne,radiusTwo);
        Assert.assertFalse(result);
    }

    @Test
    public void setRadiusTestPositiveFlow(){
        String userInput = "4.5";
        String expectedOutput = "1 Please enter radius value (e.g. '2' or '3.46'): ";
        double result = CircleArea.setRadius(userInput);
        String resultOutput = outContent.toString();
        Assert.assertEquals(Double.parseDouble(userInput),result,1);
        Assert.assertEquals(expectedOutput,resultOutput);
    }

    @Test
    public void setRadiusTestNegativeFlow(){
        String userInput = "test";
        String expectedOutput = "1 Please enter radius value (e.g. '2' or '3.46'): " +
                "1 You entered wrong input value, please try again. (java.lang.NumberFormatException: For input string: \"test\")\n" +
                "1 Input value should be of type double: e.g. '2' or '3.46'\n" +
                "2 Please enter radius value (e.g. '2' or '3.46'): " +
                "2 You entered wrong input value, please try again. (java.lang.NumberFormatException: For input string: \"test\")\n" +
                "2 Input value should be of type double: e.g. '2' or '3.46'\n" +
                "3 Please enter radius value (e.g. '2' or '3.46'): " +
                "3 You entered wrong input value, please try again. (java.lang.NumberFormatException: For input string: \"test\")\n" +
                "3 Input value should be of type double: e.g. '2' or '3.46'\n" +
                "4 Please enter radius value (e.g. '2' or '3.46'): " +
                "4 You entered wrong input value, please try again. (java.lang.NumberFormatException: For input string: \"test\")\n" +
                "4 Input value should be of type double: e.g. '2' or '3.46'\n" +
                "5 Please enter radius value (e.g. '2' or '3.46'): " +
                "5 You entered wrong input value, please try again. (java.lang.NumberFormatException: For input string: \"test\")\n" +
                "5 Input value should be of type double: e.g. '2' or '3.46'\n" +
                "You've entered invalid value 5 times in a row. Setting radius to default value: 0.0\n";
        double result = CircleArea.setRadius(userInput);
        String resultOutput = outContent.toString();
        Assert.assertEquals(0.0,result,1);
        Assert.assertEquals(expectedOutput,resultOutput);
    }

    @Test
    public void setRadiusTestBelowZeroFlow(){
        String userInput = "-2.2";
        String expectedOutput = "1 Please enter radius value (e.g. '2' or '3.46'): " +
                "1 You've entered incorrect radius value: "+ userInput +" - radius should be more then zero\n" +
                "2 Please enter radius value (e.g. '2' or '3.46'): " +
                "2 You've entered incorrect radius value: "+ userInput +" - radius should be more then zero\n" +
                "3 Please enter radius value (e.g. '2' or '3.46'): " +
                "3 You've entered incorrect radius value: "+ userInput +" - radius should be more then zero\n" +
                "4 Please enter radius value (e.g. '2' or '3.46'): " +
                "4 You've entered incorrect radius value: "+ userInput +" - radius should be more then zero\n" +
                "5 Please enter radius value (e.g. '2' or '3.46'): " +
                "5 You've entered incorrect radius value: "+ userInput +" - radius should be more then zero\n" +
                "You've entered invalid value 5 times in a row. Setting radius to default value: 0.0\n";
        double result = CircleArea.setRadius(userInput);
        String resultOutput = outContent.toString();
        Assert.assertEquals(0.0,result,1);
        Assert.assertEquals(expectedOutput,resultOutput);
    }
}
