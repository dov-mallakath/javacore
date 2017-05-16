package com.kitcenter.homework.lesson5;

import com.kitcenter.app.homework.lesson5.TriangleSidesCheck;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-08
 */
@RunWith(JUnitParamsRunner.class)
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
    @FileParameters(value = "src/test/resources/TriangleSidesCheckTest.csv",
            mapper = CsvWithHeaderMapper.class)
    public void checkDataToBeTriangleSidesTest(double sideOne, double sideTwo, double sideThree, double sideFour, Boolean expectedResult){
        List<Double> validInputDataList = new ArrayList<Double>();
        if (sideFour==0) {validInputDataList.add(sideOne); validInputDataList.add(sideTwo);validInputDataList.add(sideThree);}
        else {validInputDataList.add(sideOne); validInputDataList.add(sideTwo);validInputDataList.add(sideThree);validInputDataList.add(sideThree);}
        double [] validInputData = new double[validInputDataList.size()];
        for(int iterator=0; iterator<validInputDataList.size();iterator++){
            validInputData[iterator]=validInputDataList.get(iterator);
        }
        boolean result = triangleSidesCheck.checkDataToBeTriangleSides(validInputData);
        Assert.assertEquals(expectedResult,result);
    }

    @Deprecated
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
