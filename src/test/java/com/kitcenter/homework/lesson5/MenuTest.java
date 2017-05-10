package com.kitcenter.homework.lesson5;

import com.kitcenter.app.homework.lesson5.Menu;
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
public class MenuTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Menu menu = new Menu();

//    class EmulateUser extends Thread{
//        @Override
//        public void run()
//        {
//            for(int i = 0; i < 5; i++)
//            {
//                try{
//                    sleep(1000);
//                }catch(InterruptedException e){}
//
//                System.out.println("test");
//                emulateUserInput("quit");
//                try {
//                    user.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                this.yield();
//            }
//        }
//    }
//
//    EmulateUser user;

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
                "1: Check if three numbers could be sizes of sides of right angled triangle\n" +
                "2: Check if a number is even or odd\n" +
                "3: Compare two numbers\n" +
                "Bye!\n";
        emulateUserInput("quit");
        menu.commandParser();
        String resultOutput = outContent.toString();
        Assert.assertEquals(expectedOutput,resultOutput);
    }

//    @Test
//    public void menuTestRunOne(){
//        //user = new EmulateUser();
//        String expectedOutput = "\nMenu:\n" +
//                "Select what class U wish to execute by entering it's list number (e.g. \"2\") and pressing \"enter\"\n" +
//                "(To exit program type \"quit\" and press \"enter\")\n" +
//                "1: Check if three numbers could be sizes of sides of right angled triangle\n" +
//                "2: Check if a number is even or odd\n" +
//                "3: Compare two numbers\n" +
//                "1 Please enter variable value (e.g. '2' or '3,46'): \n";
//        //emulateUserInput("test");
//        //user.start();
//        emulateUserInput("test" + System.lineSeparator() + "quit" + System.lineSeparator());
//        String value = "test" + System.lineSeparator() + "quit" + System.lineSeparator();
//        System.setIn(new ByteArrayInputStream(value.getBytes()));
//        new Menu();
//        String resultOutput = outContent.toString();
//        Assert.assertEquals(expectedOutput,resultOutput);
//    }
}
