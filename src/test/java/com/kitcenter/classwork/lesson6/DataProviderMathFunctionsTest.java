package com.kitcenter.classwork.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-13
 */
@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionsTest {

    @Test
    @FileParameters(value = "src/test/resources/testdata.csv",
    mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestMultiply(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, Math.multiplyExact(argA,argB));
    }

}
