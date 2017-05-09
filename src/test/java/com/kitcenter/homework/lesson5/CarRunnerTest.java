package com.kitcenter.homework.lesson5;

import com.kitcenter.runners.classwork.lesson5.CarRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-09
 */
public class CarRunnerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    public void carRunnerTest(){
        String expectedResult="BMW\n" +
                "10\n" +
                "110\n" +
                "Audi\n" +
                "110\n" +
                "110\n" +
                "Speed is 110\n" +
                "10\n";
        String[] args = null;
        CarRunner.main(args);
        String resultOutput = outContent.toString();
        Assert.assertEquals(expectedResult,resultOutput);
    }
}
