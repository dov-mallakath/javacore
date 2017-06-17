package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.Circle;
import com.kitcenter.app.classwork.lesson15.Figure;
import com.kitcenter.app.classwork.lesson15.Rectangle;
import com.kitcenter.app.classwork.lesson15.Triangle;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class FigureRunner {
    public static void main(String[] args) {
        Figure circle = new Circle(5);
        Figure rectangle = new Rectangle(5,8);
        Figure triangle = new Triangle(5,5,5);

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        getPerimeter(triangle);
    }

    public static void getPerimeter(Figure figure){
        System.out.println(figure.getPerimeter());
    }
}
