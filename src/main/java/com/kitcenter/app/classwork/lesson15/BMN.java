package com.kitcenter.app.classwork.lesson15;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class BMN implements BicycleRepair {

    @Override
    public void changeGear(int value) {
        System.out.println("BMN changing gear to :" + value);
    }

    @Override
    public void shift() {

    }
}
