package com.kitcenter.app.classwork.lesson5;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-06
 */
public class Car {
    public String name;
    public static int speed = 10;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static void getSpeed() {
        System.out.println("Speed is " + speed);
    }
}
