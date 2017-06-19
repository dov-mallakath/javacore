package com.kitcenter.app.homework.Lesson15;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-19
 */
public class CustomBicycle extends Bicycle {

    private int speed;
    private int gear;

    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println("New speed is " + getSpeed());
    }
    public void setGear(int gear){
        this.gear = gear;
        System.out.println("New gear is " + getGear());
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    @Override
    public void ride(){
        System.out.println("Wshhhhh!");
    }

}
