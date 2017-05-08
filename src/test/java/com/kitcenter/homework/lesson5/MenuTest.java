package com.kitcenter.homework.lesson5;

import com.kitcenter.app.homework.lesson5.Menu;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-09
 */
public class MenuTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private void emulateUserInput(String value){
        System.setIn(new ByteArrayInputStream(value.getBytes()));
    }

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
    public void menuTestQuit(){
        String expectedOutput = "\nMenu:\n" +
                "Select what class U wish to execute by entering it's list number (e.g. \"2\") and pressing \"enter\"\n" +
                "(To exit program type \"quit\" and press \"enter\")\n" +
                "1: Check if three numbers could be sizes of ides of right angled triangle\n" +
                "2: Check if a number is even or odd\n" +
                "3: Compare two numbers\n" +
                "Bye!\n";
        emulateUserInput("quit");
        new Menu();
        String resultOutput = outContent.toString();
        Assert.assertEquals(expectedOutput,resultOutput);
    }
}
