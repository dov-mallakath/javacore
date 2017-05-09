package com.kitcenter.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.Calculator;
import org.junit.*;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-03
 */
public class CalculatorTest {

    int testNumberOne, testNumberTwo;
    Calculator calculator = new Calculator();;


    /**
     * Why this should be static???
     * Initializing something for testing Calculator class
     */
    @BeforeClass
    public static void setUpBeforeClass() {

    }

    @Before
    public void setUp() {
        testNumberOne = 4;
        testNumberTwo = 3;
    }

    @After
    public void tearDown() {
        System.out.println("Test is either failed or passed");
    }

    @AfterClass
    public static void tearDownForClass() {
        System.out.println("Test execution completed");
    }

    @Test
    public void sumTest() {
        int expectedResult = 7;
        int actualResult = calculator.sum(testNumberOne,testNumberTwo);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void sumTestNegativeNegative() {
        int expectedResult = -7;
        int actualResult = calculator.sum(testNumberOne*-1,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void sumTestPositiveNegative() {
        int expectedResult = 1;
        int actualResult = calculator.sum(testNumberOne,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void multiplyTest() {
        int expectedResult = 12;
        int actualResult = calculator.multiply(testNumberOne,testNumberTwo);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void multiplyTestNegativeNegative() {
        int expectedResult = 12;
        int actualResult = calculator.multiply(testNumberOne*-1,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void multiplyTestPositiveNegative() {
        int expectedResult = -12;
        int actualResult = calculator.multiply(testNumberOne,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void multiplyTestZero() {
        int expectedResult = 0;
        int actualResult = calculator.multiply(testNumberOne,0);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void substractTest() {
        int expectedResult = 1;
        int actualResult = calculator.substract(testNumberOne,testNumberTwo);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void substractTestNegativeNegative() {
        int expectedResult = -1;
        int actualResult = calculator.substract(testNumberOne*-1,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void substractTestPositiveNegative() {
        int expectedResult = 7;
        int actualResult = calculator.substract(testNumberOne,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void powerTest() {
        int expectedResult = 64;
        int actualResult = calculator.power(testNumberOne,testNumberTwo);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void powerTestZeroPower() {
        int expectedResult = 1;
        int actualResult = calculator.power(testNumberOne,0);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void powerTestNegativePower() {
        double expectedResult = 0.0625;
        int actualResult = calculator.power(testNumberOne,-2);
        Assert.assertEquals(expectedResult,actualResult,4);
    }

}
