package com.kitcenter.app.homework.lesson5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-06
 */
public class UserInputData {

    public static double setVariable(){
        double variable = 0;
        int counter = 1;
        while ((variable <= 0)&&(counter<6)) {
            boolean isException = false;
            System.out.print(counter + " Please enter variable value (e.g. '2' or '3,46'): ");
            try {
                Scanner scanner = new Scanner(System.in);
                variable = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println(counter + " You entered wrong input value, please try again. (" + e + ")");
                System.out.println(counter + " Input value should be of type double: e.g. '2' or '3,46'");
                isException = true;
            }
            if ((variable <= 0)&&(!isException)) {
                System.out.println(counter + " You've entered incorrect variable value: "+variable+" - variable should be more then zero");
            }
            if (counter == 5) {
                variable = 0;
                System.out.println("You've entered invalid value " + counter + " times in a row. Setting variable to default value: " + variable);
            }
            counter++;
        }
        return variable;
    }

    public static double[] setBundleOfVariables(int numberOfVariables){
        System.out.println("Please enter " + numberOfVariables + " variables, one by one:");
        double[] bundleOfVariables = new double[numberOfVariables];
        for (int iterator=0; iterator<numberOfVariables; iterator++) {
           bundleOfVariables[iterator] = setVariable();
        }
        return bundleOfVariables;
    }
}
