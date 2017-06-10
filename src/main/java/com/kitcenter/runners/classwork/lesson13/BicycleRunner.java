package com.kitcenter.runners.classwork.lesson13;

import com.kitcenter.app.classwork.lesson13.Bicycle;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-07
 */
public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycleNoname = new Bicycle();
        System.out.println(bicycleNoname.getColor() + bicycleNoname.wheelSize + bicycleNoname.getBicycleName());
        String name = "KOMANCHE";
        Bicycle bicycle = new Bicycle(name);
        bicycle.setColor("GEREN");
        bicycle.setBicycleName("KOMANCHE-NEW");
        System.out.println(bicycle.getColor() + bicycle.wheelSize + bicycle.getBicycleName());
        String color = "RED";
        Bicycle bicycleTwo = new Bicycle(name,color);
        System.out.println(bicycleTwo.getColor() + bicycleTwo.wheelSize + bicycleTwo.getBicycleName());
        int wheelSize = 22;
        Bicycle bicycleThree = new Bicycle(name,wheelSize);
        System.out.println(bicycleThree.getColor() + bicycleThree.wheelSize + bicycleThree.getBicycleName());

        Bicycle bicycleComplete = new Bicycle(wheelSize,color,name);
        System.out.println(bicycleComplete.getColor() + bicycleComplete.wheelSize + bicycleComplete.getBicycleName());



    }
}
