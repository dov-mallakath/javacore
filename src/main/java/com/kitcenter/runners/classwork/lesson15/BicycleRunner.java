package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.*;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class BicycleRunner {

    public static void main(String[] args) {
        Bicycle bma = new BMA();
        Bicycle acme = new ACME();
        Bicycle bmn = new BMN();
        BicycleRepair bmaWithFix = new BMA();

        System.out.println(Bicycle.PI);
        bmaWithFix.changeTyre("front");
        bicycleActions(bma,2);
        bicycleActions(acme,3);
        bicycleActions(bmn,3);
        bicycleActions(bma,3,10);
    }

    public static void bicycleActions(Bicycle bicycle, int value){
        bicycle.changeGear(value);
        bicycle.shift();
    }

    public static void bicycleActions(Bicycle bicycle, int value, int speed){
        bicycle.changeGear(value);
        bicycle.shift();
        bicycle.changeSpeed(speed);
    }

}
