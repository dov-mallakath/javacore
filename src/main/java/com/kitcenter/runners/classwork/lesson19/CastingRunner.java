package com.kitcenter.runners.classwork.lesson19;

import com.kitcenter.app.classwork.lesson14.Car;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public class CastingRunner {
    public static void main(String[] args) {
        Car car = new Car("BMW",150);
        Object carObject = new Car("Fiat", 150);
        Object carObjectFromCar = car;
        car = (Car)carObjectFromCar;
        String carString = (String)carObjectFromCar;
        System.out.println(carString);
    }
}
