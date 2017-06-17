package com.kitcenter.app.classwork.lesson15;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public interface Bicycle {

    double PI = 3.14;

    void changeGear(int value);
    void shift();

    default int changeSpeed(int speed){
        System.out.println("Default method, speed is: " + speed);
        return speed;
    }

    default void changeSpeed(){
        System.out.println("Changing max speed for bicycle");
    }

}
