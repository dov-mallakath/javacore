package com.kitcenter.app.classwork.lesson15;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class BMA implements BicycleRepair {

    @Override
    public void changeGear(int value) {
        System.out.println("BMA changing gear: " + value);
    }

    @Override
    public void shift() {
    }
}