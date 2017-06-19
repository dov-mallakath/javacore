package com.kitcenter.app.homework.Lesson15;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-19
 */
public abstract class Bicycle {

    public abstract void setSpeed(int value);
    public abstract void setGear(int value);

    public void ride(){
        System.out.println("Wroom!");
    }

}
