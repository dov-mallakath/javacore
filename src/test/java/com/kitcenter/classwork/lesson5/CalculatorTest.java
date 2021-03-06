package com.kitcenter.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.Calculator;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-03
 */
@RunWith(JUnitParamsRunner.class)
@FixMethodOrder(MethodSorters.JVM)
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
    @FileParameters(value = "src/test/resources/sumTest.csv",
            mapper = CsvWithHeaderMapper.class)
    public void sumTest(int variableOne, int variableTwo, int expectedResult) {
        int actualResult = calculator.sum(variableOne,variableTwo);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Deprecated
    @Test
    public void sumTestNegativeNegative() {
        int expectedResult = -7;
        int actualResult = calculator.sum(testNumberOne*-1,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Ignore
    @Test(timeout = 1000)
    public void infinityTest(){
    while (true);
    }

    @Deprecated
    @Test
    public void sumTestPositiveNegative() {
        int expectedResult = 1;
        int actualResult = calculator.sum(testNumberOne,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    @FileParameters(value = "src/test/resources/multiplyTest.csv",
            mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int variableOne, int variableTwo, int expectedResult) {
        int actualResult = calculator.multiply(variableOne,variableTwo);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Deprecated
    @Test
    public void multiplyTestNegativeNegative() {
        int expectedResult = 12;
        int actualResult = calculator.multiply(testNumberOne*-1,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Deprecated
    @Test
    public void multiplyTestPositiveNegative() {
        int expectedResult = -12;
        int actualResult = calculator.multiply(testNumberOne,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Deprecated
    @Test
    public void multiplyTestZero() {
        int expectedResult = 0;
        int actualResult = calculator.multiply(testNumberOne,0);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    @FileParameters(value = "src/test/resources/substractTest.csv",
            mapper = CsvWithHeaderMapper.class)
    public void substractTest(int variableOne, int variableTwo, int expectedResult) {
        int actualResult = calculator.substract(variableOne,variableTwo);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Deprecated
    @Test
    public void substractTestNegativeNegative() {
        int expectedResult = -1;
        int actualResult = calculator.substract(testNumberOne*-1,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Deprecated
    @Test
    public void substractTestPositiveNegative() {
        int expectedResult = 7;
        int actualResult = calculator.substract(testNumberOne,testNumberTwo*-1);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    @FileParameters(value = "src/test/resources/powerTest.csv",
            mapper = CsvWithHeaderMapper.class)
    public void powerTest(int variableOne, int variableTwo, double expectedResult) {
        int actualResult = calculator.power(variableOne,variableTwo);
        Assert.assertEquals(expectedResult,actualResult,5);
    }

    @Deprecated
    @Test
    public void powerTestZeroPower() {
        int expectedResult = 1;
        int actualResult = calculator.power(testNumberOne,0);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Deprecated
    @Test
    public void powerTestNegativePower() {
        double expectedResult = 0.0625;
        int actualResult = calculator.power(testNumberOne,-2);
        Assert.assertEquals(expectedResult,actualResult,4);
    }

}
