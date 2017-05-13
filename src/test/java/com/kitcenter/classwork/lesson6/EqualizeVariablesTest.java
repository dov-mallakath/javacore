package com.kitcenter.classwork.lesson6;

import com.kitcenter.app.homework.lesson6.EqualizeVariables;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-13
 */
@RunWith(JUnitParamsRunner.class)
public class EqualizeVariablesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    EqualizeVariables equalizeVariables = new EqualizeVariables();

    private void emulateUserInput(String value){
        System.setIn(new ByteArrayInputStream(value.getBytes()));
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    @FileParameters(value = "src/test/resources/testdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void equalizeVariablesTest(double variableOne, double variableTwo, double test){
        int iterations = (int)variableOne-(int)variableTwo;
        String expectedOutput = "";
        //Setting up dynamic result block
        int variableOneForIterations = (int)variableOne-1;
        for (int iterator=0; iterator<iterations; iterator++) {
            expectedOutput += "a = "+ variableOneForIterations-- +".0; b = "+ (int)variableTwo +".0\n";
        }
        expectedOutput += "a = "+(int)variableTwo+".0; b = "+(int)variableTwo+".0. a <= b - exiting.\n";

        equalizeVariables.equalizeVariables((int)variableOne,(int)variableTwo);
        String resultOutput = outContent.toString();

        Assert.assertEquals(expectedOutput,resultOutput);
    }


}
