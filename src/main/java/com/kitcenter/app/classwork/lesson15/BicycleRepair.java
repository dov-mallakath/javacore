package com.kitcenter.app.classwork.lesson15;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-17
 */
public interface BicycleRepair extends Bicycle, Repair {

    @Override
    default void changeSpeed(){
        System.out.println("Changing max speed for bicycle");
    }
    @Override
    default void fixChain(){
        System.out.println("Fixing the chaiin, it will take about 10 to 20 minutes");
    }

}
