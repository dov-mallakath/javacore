package com.kitcenter.app.homework.Lesson15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-19
 */
public class SetOfFlowers {

    List<Flower> flowers = new ArrayList<>();

    public SetOfFlowers(Flower[] flowers) {
        for (Flower flower:flowers) {
            this.flowers.add(flower);
        }
    }

    public SetOfFlowers(List<Flower> flowers) {
        this.flowers.addAll(flowers);
    }

    public void addFlower(Flower flower){
        this.flowers.add(flower);
    }

    public void removeFlower(Flower flower){
        this.flowers.remove(flower);
    }

    public double getPrice(){
        double price = 0;
        for (Flower flower:this.flowers) {
            price += flower.getPrice()*flower.getCount();
        }
        return price;
    }

    public double getLength(){
        double length = 0;
        for (Flower flower:this.flowers) {
            if (flower.getLength()>=length){
                length = flower.getLength();
            }
        }
        return length;
    }

    public int getCount(){
        int count = 0;
        for (Flower flower:this.flowers) {
            count += flower.getCount();
        }
        return count;
    }

    public List<String> getColors(){
        List<String> colors = new ArrayList<>();
        int counter=0;
        for (Flower flower:this.flowers) {
            if(!colors.contains(flower.getColor())){
                colors.add(flower.getColor());
            }
        }
        return colors;
    }

    @Override
    public String toString(){
        return "Colors: " + String.valueOf(getColors()) + "\n" +
                "Length: " + String.valueOf(getLength()) + "\n" +
                "Quantity: " + String.valueOf(getCount()) + "\n" +
                "Price: " + String.valueOf(getPrice());
    }

}
