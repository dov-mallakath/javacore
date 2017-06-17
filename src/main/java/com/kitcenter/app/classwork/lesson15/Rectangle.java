package com.kitcenter.app.classwork.lesson15;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class Rectangle extends Figure {

    private double dimentionOne;
    private double dimentionTwo;

    public Rectangle(double dimentionOne, double dimentionTwo){
        this.dimentionOne = dimentionOne;
        this.dimentionTwo = dimentionTwo;
    }

    @Override
    public double getPerimeter() {
        return dimentionOne*2 + dimentionTwo*2;
    }
}
