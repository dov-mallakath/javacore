package com.kitcenter.classwork.lesson4;

import com.kitcenter.app.classwork.lesson4.WideningCasting;
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
public class WideningCastingTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private byte byteOne = 127;
    private WideningCasting wideningCasting = new WideningCasting();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void wideningTest() {
        String expectedOutput = (double)byteOne+"\n";
        wideningCasting.widening();
        String resultOutput = outContent.toString();
        Assert.assertEquals(expectedOutput,resultOutput);
    }

}
