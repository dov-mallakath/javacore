package com.kitcenter.app.homework.Lesson16;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-20
 */
public class WheeledTracktor extends Tracktor {

    public WheeledTracktor(String name, int currentSpeed) {
        super(name, currentSpeed);
        this.setPaxCount(1);
        this.setWeight(800);
        this.setWheelsCount(4);
    }


}
