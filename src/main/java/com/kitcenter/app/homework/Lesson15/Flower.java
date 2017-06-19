package com.kitcenter.app.homework.Lesson15;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-19
 */
public class Flower {

    private String color;
    private double length;
    private double price;
    private int count = 1;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flower(String color, double length, double price) {
        setColor(color);
        setLength(length);
        setPrice(price);
    }
}
