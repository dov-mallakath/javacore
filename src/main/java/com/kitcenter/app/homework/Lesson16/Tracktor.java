package com.kitcenter.app.homework.Lesson16;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-20
 */
public class Tracktor extends Mashine {

    public Tracktor(String name, int currentSpeed) {
        super(name, currentSpeed);
    }


    public double getWeight(){
        return this.weight;
    }

    public int getSpeed(){
        return this.getCurrentSpeed();
    }

    public int getPaxCount(){
        return this.paxCount;
    }

    public int getWheelsCount(){
        return this.wheelsCount;
    }

    @Override
    public String toString(){
        return "Vehicle name is: " + getName() + "\n" +
                "Current speed is: " + getSpeed() + "\n" +
                "Pax count is: " + getPaxCount() + "\n" +
                "Number of wheels: " + getWheelsCount() + "\n" +
                "Weight is: " + getWeight();
    }

    public void setWheelsCount(int wheelsNum){
        this.wheelsCount = wheelsNum;
    }

    public void setPaxCount(int paxNum){
        this.paxCount = paxNum;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

}
