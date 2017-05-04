package com.kitcenter.homework.lesson4;

import com.kitcenter.app.homework.lesson4.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-04
 */
public class PrimitiveConvertorTest {
    private float floatTest = 42.1456f;
    private int intTest = 33;
    private char charTest = 'b';
    private PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();

    @Test
    public void floatToCharTest() {
        char actualResult = primitiveConvertor.floatToChar(floatTest);
        char expectedResult = '*';
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void intToCharTest() {
        char actualResult = primitiveConvertor.intToChar(intTest);
        char expectedResult = '!';
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void charToIntTest() {
        int actualResult = primitiveConvertor.charToInt(charTest);
        int expectedResult = 98;
        Assert.assertEquals(expectedResult,actualResult);
    }
}
