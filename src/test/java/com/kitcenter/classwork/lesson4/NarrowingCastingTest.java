package com.kitcenter.classwork.lesson4;

import com.kitcenter.app.classwork.lesson4.NarrowingCasting;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-12
 */
public class NarrowingCastingTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private int intOne = 127;
    private float floatTwo = 3.14159f;
    private float doubleOne = 3.14159f;
    private NarrowingCasting narrowingCasting = new NarrowingCasting();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void narrowingTest() {
        String expectedOutput = (float)intOne+"\n";
        narrowingCasting.narrowing();
        String resultOutput = outContent.toString();
        Assert.assertEquals(expectedOutput,resultOutput);
    }

    @Test
    public void narrowingCastTest() {
        String expectedOutput = (int)floatTwo+"\n";
        narrowingCasting.narrowingCast();
        String resultOutput = outContent.toString();
        Assert.assertEquals(expectedOutput,resultOutput);
    }

    @Test
    public void doubleToFloatTest() {
        String expectedOutput = (float)doubleOne+"\n";
        narrowingCasting.doubleToFloat();
        String resultOutput = outContent.toString();
        Assert.assertEquals(expectedOutput,resultOutput);
    }
}
