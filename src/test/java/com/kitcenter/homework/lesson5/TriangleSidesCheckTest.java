package com.kitcenter.homework.lesson5;

import com.kitcenter.app.homework.lesson5.TriangleSidesCheck;
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
public class TriangleSidesCheckTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private TriangleSidesCheck triangleSidesCheck = new TriangleSidesCheck();
    private double[] validInputDataOne = {5,4,3};
    private double[] validInputDataTwo = {3,4,5};
    private double[] validInputDataThree = {4,5,3};
    private double[] invalidInputDataOne = {5,4,2};
    private double[] invalidInputDataTwo = {5,4,3,1};
    private double[] invalidInputDataThree = {5,4};

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void checkDataToBeTriangleSidesPositiveTest(){
        boolean resultOne = triangleSidesCheck.checkDataToBeTriangleSides(validInputDataOne);
        boolean resultTwo = triangleSidesCheck.checkDataToBeTriangleSides(validInputDataTwo);
        boolean resultThree = triangleSidesCheck.checkDataToBeTriangleSides(validInputDataThree);
        Assert.assertTrue(resultOne);
        Assert.assertTrue(resultTwo);
        Assert.assertTrue(resultThree);
    }

    @Test
    public void checkDataToBeTriangleSidesNegativeTest(){
        boolean result = triangleSidesCheck.checkDataToBeTriangleSides(invalidInputDataOne);
        Assert.assertFalse(result);
    }

    @Test
    public void triangleSidesCheckPositiveTest(){
        String expectedResult = "Variables are the sides of right-angled triangle" + System.lineSeparator();
        boolean resultOne = triangleSidesCheck.triangleSidesCheck(validInputDataOne);
        String resultOneOutput = outContent.toString();
        outContent.reset();
        boolean resultTwo = triangleSidesCheck.triangleSidesCheck(validInputDataTwo);
        String resultTwoOutput = outContent.toString();
        outContent.reset();
        boolean resultThree = triangleSidesCheck.triangleSidesCheck(validInputDataThree);
        String resultThreeOutput = outContent.toString();
        Assert.assertTrue(resultOne);
        Assert.assertTrue(resultTwo);
        Assert.assertTrue(resultThree);
        Assert.assertEquals(expectedResult,resultOneOutput);
        Assert.assertEquals(expectedResult,resultTwoOutput);
        Assert.assertEquals(expectedResult,resultThreeOutput);
    }

    @Test
    public void triangleSidesCheckNegativeTest(){
        String expectedResult = "Variables are NOT the sides of right-angled triangle" + System.lineSeparator();
        boolean resultOne = triangleSidesCheck.triangleSidesCheck(invalidInputDataOne);
        String resultOneOutput = outContent.toString();
        outContent.reset();
        boolean resultTwo = triangleSidesCheck.triangleSidesCheck(invalidInputDataTwo);
        String resultTwoOutput = outContent.toString();
        outContent.reset();
        boolean resultThree = triangleSidesCheck.triangleSidesCheck(invalidInputDataThree);
        String resultThreeOutput = outContent.toString();
        Assert.assertFalse(resultOne);
        Assert.assertFalse(resultTwo);
        Assert.assertFalse(resultThree);
        Assert.assertEquals(expectedResult,resultOneOutput);
        Assert.assertEquals(expectedResult,resultTwoOutput);
        Assert.assertEquals(expectedResult,resultThreeOutput);
    }
}
