package com.kitcenter.app.classwork.lesson5;

import java.util.Scanner;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-06
 */
public class CircleArea {


    public static double setRadius(){
        double radius = 0;
        int counter = 1;
        while ((radius <= 0)&&(counter<6)) {
            boolean isException = false;
            System.out.print(counter + " Please enter radius value (e.g. '2' or '3.46'): ");
            try {
                Scanner scanner = new Scanner(System.in);
                radius = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println(counter + " You entered wrong input value, please try again. (" + e + ")");
                System.out.println(counter + " Input value should be of type double: e.g. '2' or '3.46'");
                isException = true;
            }
            if ((radius <= 0)&&(!isException)) {
                System.out.println(counter + " You've entered incorrect radius value: "+radius+" - radius should be more then zero");
            }
            if (counter == 5) {
                radius = 0;
                System.out.println("You've entered invalid value " + counter + " times in a row. Setting radius to default value: " + radius);
            }
            counter++;
        }
        return radius;
    }

    public static double calculate(double radius){
        Calculator calculator = new Calculator();
        double circleArea = Math.PI*calculator.power(radius,2);
        System.out.println("Area is " + circleArea);
        return circleArea;
    }

    public static boolean calculateBigger(double radiusOne, double radiusTwo){
        double areaOne = calculate(radiusOne);
        double areaTwo = calculate(radiusTwo);
        if ((radiusOne>radiusTwo)||(areaOne>areaTwo))
            {System.out.println("Area one is bigger then Area two");
            return true;
        } else {
            System.out.println("Area two is bigger then Area one");
            return false;
        }

    }
}
