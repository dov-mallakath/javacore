package com.kitcenter.classwork.lesson6;

import com.kitcenter.app.homework.lesson6.CountEvenNumbersInRange;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-15
 */
@RunWith(JUnitParamsRunner.class)
public class CountEvenNumbersInRangeTest {
    CountEvenNumbersInRange countEvenNumbersInRange = new CountEvenNumbersInRange();

    @Test
    @FileParameters(value = "src/test/resources/CountEvenNumbersInRangeTest.csv",
            mapper = CsvWithHeaderMapper.class)
    public void setCountEvenNumbersInRangeTest(int startRange, int endRange, int quantity){
        int result = countEvenNumbersInRange.countEvenNumbersInRange(startRange,endRange);
        Assert.assertEquals(quantity,result);
    }
}
