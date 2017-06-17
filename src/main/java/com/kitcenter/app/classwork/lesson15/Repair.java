package com.kitcenter.app.classwork.lesson15;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-17
 */
public interface Repair {

    void fixChain();

    default void changeTyre(String wheel){
        System.out.println("Changing tyre on " + wheel + " wheel");
    }

    default void changeSpeed(){
        System.out.println("Changing max speed for bicycle");
    }

}
