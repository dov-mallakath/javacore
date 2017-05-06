package com.kitcenter.runners.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.Car;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-06
 */
public class CarRunner {

//    int counter = 10;
//    this won't work within the static method
    static int counter = 10;

    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.name = "BMW";
        System.out.println(car.name);
        System.out.println(car.speed);
        car.setSpeed(120);
        car2.setSpeed(110);
        System.out.println(car.speed);
        car2.name = "Audi";
        System.out.println(car2.name);
        System.out.println(car2.speed);
        // the right way to call on static variables
        System.out.println(Car.speed);
        Car.getSpeed();
        System.out.println(counter);
    }
}
