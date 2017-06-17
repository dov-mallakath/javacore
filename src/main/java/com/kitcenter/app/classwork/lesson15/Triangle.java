package com.kitcenter.app.classwork.lesson15;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class Triangle extends Figure{

    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle (double sideOne, double sideTwo, double sideThree){
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double getPerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
