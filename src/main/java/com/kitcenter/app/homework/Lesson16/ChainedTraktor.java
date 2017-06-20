package com.kitcenter.app.homework.Lesson16;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-20
 */
public class ChainedTraktor extends Tracktor{

    public ChainedTraktor(String name, int currentSpeed) {
        super(name, currentSpeed);
        this.setPaxCount(2);
        this.setWeight(5000);
        this.setWheelsCount(12);
    }
}
