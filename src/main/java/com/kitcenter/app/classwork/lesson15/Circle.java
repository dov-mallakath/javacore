package com.kitcenter.app.classwork.lesson15;

import com.kitcenter.app.classwork.lesson5.Calculator;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class Circle extends Figure {

    private double radius;
    Calculator calculator = new Calculator();

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * calculator.power(radius,2);
    }
}
