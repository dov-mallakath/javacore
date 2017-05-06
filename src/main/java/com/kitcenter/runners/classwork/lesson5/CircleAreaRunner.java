package com.kitcenter.runners.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.CircleArea;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-06
 */
public class CircleAreaRunner {
    public static void main(String[] args) {
        CircleArea.calculate(CircleArea.setRadius());
        CircleArea.calculateBigger(CircleArea.setRadius(),CircleArea.setRadius());
    }
}
