package com.kitcenter.app.homework.lesson5;

import com.kitcenter.app.classwork.lesson5.Calculator;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-07
 */
public class TriangleSidesCheck {

    public boolean triangleSidesCheck(double[] doubles) {
        boolean dataAreTriangleSides;
        dataAreTriangleSides = doubles.length == 3 && checkDataToBeTriangleSides(doubles);
//        if (doubles.length == 3){
//            dataAreTriangleSides = checkDataToBeTriangleSides(doubles);
//        }else{
//            dataAreTriangleSides = false;
//        }
        if (dataAreTriangleSides) {
            System.out.println("Variables are the sides of right-angled triangle");
        }else{
            System.out.println("Variables are NOT the sides of right-angled triangle");
        }
        return dataAreTriangleSides;
    }

    public boolean checkDataToBeTriangleSides(double[] doubles){
        Calculator calculator = new Calculator();
        Arrays.sort(doubles);
        return calculator.power(doubles[2],2) == calculator.power(doubles[1],2)+calculator.power(doubles[0],2);
    }

}
