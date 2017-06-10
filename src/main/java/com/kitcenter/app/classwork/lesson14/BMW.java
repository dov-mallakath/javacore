package com.kitcenter.app.classwork.lesson14;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-10
 */
public class BMW extends Car{
    public BMW (String name, int speed){
        super(name,speed);
    }

    public void drives(){
        System.out.println("This is a " + getClassName() + " car with Electric engine");
    }

}
