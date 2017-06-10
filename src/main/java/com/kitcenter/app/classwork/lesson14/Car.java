package com.kitcenter.app.classwork.lesson14;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-10
 */
public class Car {
    protected String name;
    protected int speed;

    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void printNameAndSpeed(){
        System.out.println(getClassName()+" Model name is:"+getName()+"; Speed is: "+getSpeed());
    }

    public String getClassName(){
        return this.getClass().getSimpleName();
    }

    public void drives(){
        System.out.println("This is a " + getClassName() + " car with basic engine");
    }

}
