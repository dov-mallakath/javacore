package com.kitcenter.app.homework.Lesson16;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-20
 */
public abstract class Mashine implements Run {

    protected static final int MAX_SPEED = 200;
    protected static final int MIN_SPEED = 1;
    protected static final int MIN_PAX_COUNT = 1;
    protected static final int MAX_PAX_COUNT = 5;

    private String name;
    private int currentSpeed;
    protected double weight;
    protected int paxCount;
    protected int wheelsCount;


    public Mashine(String name, int currentSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
    }

    public void printName(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
