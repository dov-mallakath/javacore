package com.kitcenter.homework.lesson5;

import com.kitcenter.app.homework.lesson5.UserInputData;
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
 * @since 2017-05-08
 */
public class UserInputDataTest {
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
    public void setVariableTestPositive(){
        double testVariable = 4.24;
        emulateUserInput(String.valueOf(testVariable).replace(".",","));
        double result = UserInputData.setVariable();
        Assert.assertEquals(testVariable,result,2);
    }

    @Test
    public void setVariableTestNegative(){
        double testVariable = -4.24;
        String expectedOutput = "1 Please enter variable value (e.g. '2' or '3,46'): 1 You've entered incorrect variable value: "+testVariable+" - variable should be more then zero\n" +
                "2 Please enter variable value (e.g. '2' or '3,46'): 2 You entered wrong input value, please try again. (java.util.NoSuchElementException)\n" +
                "2 Input value should be of type double: e.g. '2' or '3,46'\n" +
                "3 Please enter variable value (e.g. '2' or '3,46'): 3 You entered wrong input value, please try again. (java.util.NoSuchElementException)\n" +
                "3 Input value should be of type double: e.g. '2' or '3,46'\n" +
                "4 Please enter variable value (e.g. '2' or '3,46'): 4 You entered wrong input value, please try again. (java.util.NoSuchElementException)\n" +
                "4 Input value should be of type double: e.g. '2' or '3,46'\n" +
                "5 Please enter variable value (e.g. '2' or '3,46'): 5 You entered wrong input value, please try again. (java.util.NoSuchElementException)\n" +
                "5 Input value should be of type double: e.g. '2' or '3,46'\n" +
                "You've entered invalid value 5 times in a row. Setting variable to default value: 0.0\n";
        emulateUserInput(String.valueOf(testVariable).replace(".",","));
        double result = UserInputData.setVariable();
        String resultOutput = outContent.toString();
        Assert.assertEquals(0.00,result,2);
        Assert.assertEquals(expectedOutput,resultOutput);
    }
}
