package com.kitcenter.app.classwork.lesson5;

import java.util.Scanner;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-06
 */
public class CircleArea {


    public static double setRadius(){
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        return radius;
    }

    public static double calculate(double radius){
        Calculator calculator = new Calculator();
        double circleArea = Math.PI*calculator.power((int)radius,2);
        System.out.println("Area is " + circleArea);
        return circleArea;
    }

    public static boolean calculateBigger(double radiusOne, double radiusTwo){
        double areaOne = calculate(radiusOne);
        double areaTwo = calculate(radiusTwo);
        if (areaOne>areaTwo)
            {System.out.println("Area one is bigger");
            return true;
        } else {
            System.out.println("Area two is bigger");
            return false;
        }

    }
}
