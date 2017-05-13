package com.kitcenter.app.homework.lesson6;

import com.kitcenter.app.homework.lesson5.UserInputData;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-13
 */
public class EqualizeVariables {

//    public void equalizeVariables() {
//        int variableOne = (int) UserInputData.setVariable();
//        int variableTwo = (int) UserInputData.setVariable();
//
//        while (variableOne>variableTwo) {
//            variableOne--;
//            System.out.println("a = " + variableOne + "; b = " + variableTwo);
//        }
//        System.out.println("a = " + variableOne + "; b = " + variableTwo + ". a <= b - exiting.");
//    }

    public void equalizeVariables(double variableOne, double variableTwo) {

        while (variableOne>variableTwo) {
            variableOne--;
            System.out.println("a = " + variableOne + "; b = " + variableTwo);
        }
        System.out.println("a = " + variableOne + "; b = " + variableTwo + ". a <= b - exiting.");
    }

}
