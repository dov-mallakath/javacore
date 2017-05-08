package com.kitcenter.app.homework.lesson5;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-08
 */
public class IsEvenCheck {
    public boolean isEven(double variable){
        boolean isEven=false;
        if (variable%(int)variable!=0){
            System.out.println("Variable " +variable+ " cannot be odd or even - only integers are eligible for the check");
        } else {
            if (variable%2==0) {
                System.out.println("The input variable is even");
                isEven=true;
            } else {
                System.out.println("The input variable is odd");
            }
        }
        return isEven;
    }
}
