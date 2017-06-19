package com.kitcenter.runners.homework.Lesson15;

import com.kitcenter.app.homework.Lesson15.Bicycle;
import com.kitcenter.app.homework.Lesson15.BicycleWithRing;
import com.kitcenter.app.homework.Lesson15.BicycleWithRingInterface;
import com.kitcenter.app.homework.Lesson15.CustomBicycle;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-19
 */
public class BicyclesRunner {

    public static void main(String[] args) {
        BicycleWithRingInterface bicycleWithRing = new BicycleWithRing();
        bicycleWithRing.ring();
        Bicycle customBicycle = new CustomBicycle();
        customBicycle.setGear(5);
        customBicycle.ride();
    }

}
