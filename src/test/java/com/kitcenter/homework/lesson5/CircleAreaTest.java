package com.kitcenter.homework.lesson5;

import com.kitcenter.app.classwork.lesson5.CircleArea;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-06
 */
public class CircleAreaTest {

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
}
