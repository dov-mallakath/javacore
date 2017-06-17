package com.kitcenter.app.classwork.lesson15;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class ACME implements BicycleRepair {

    @Override
    public void changeGear(int value) {
        System.out.println("ACME changing gear to :" + value);
    }

    @Override
    public void shift() {

    }
}
