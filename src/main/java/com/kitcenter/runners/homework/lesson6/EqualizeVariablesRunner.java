package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson5.UserInputData;
import com.kitcenter.app.homework.lesson6.EqualizeVariables;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-13
 */
public class EqualizeVariablesRunner {
    public static void main(String[] args) {
        int variableOne = (int) UserInputData.setVariable();
        int variableTwo = (int) UserInputData.setVariable();
        EqualizeVariables equalizeVariables = new EqualizeVariables();
                equalizeVariables.equalizeVariables((int)variableOne,(int)variableTwo);
    }

    /**
     * @author Denys Ovcharuk (DOV) / WorldTicket A/S
     * @since 2017-05-13
     */
    public static class IteratorRunner {
        public static void main(String[] args) {
    //        for (int iterator=0; iterator<=10; iterator++) {
    //            System.out.println("Iterator = " + iterator);
    //        }

            int testIncrementValue = 1;
            System.out.println("Original testIncrementValue: " + testIncrementValue);
            System.out.println("Post-increment testIncrementValue: " + testIncrementValue++);
            System.out.println("After post-increment testIncrementValue: " + testIncrementValue);
            System.out.println("Pre-increment testIncrementValue: " + ++testIncrementValue);
            System.out.println("After testIncrementValue: " + testIncrementValue);
        }
    }
}
