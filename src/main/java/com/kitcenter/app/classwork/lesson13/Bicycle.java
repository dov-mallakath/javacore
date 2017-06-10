package com.kitcenter.app.classwork.lesson13;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-07
 */
public class Bicycle {

    public int wheelSize;
    private String color;
    private String bicycleName = "KOMANCHE";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBicycleName() {
        return bicycleName;
    }

    public void setBicycleName(String bicycleName) {
        this.bicycleName = bicycleName;
    }

    public Bicycle(){
        System.out.println(bicycleName);
    }

    public Bicycle(String bicycleName){
        this.bicycleName = bicycleName;
    }

    public Bicycle(String bicycleName, String color){
        this(bicycleName);
        this.color = color;
    }

    public Bicycle(String bicycleName, int wheelSize){
        this(bicycleName);
        this.wheelSize = wheelSize;
    }

    public Bicycle(int wheelSize, String color, String bicycleName) {
        this(bicycleName, wheelSize);
        this.color = color;
        this.printMe();
    }

    public void printMe(){
        System.out.println("Print");
    }
}
