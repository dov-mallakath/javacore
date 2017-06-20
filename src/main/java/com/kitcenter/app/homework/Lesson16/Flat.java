package com.kitcenter.app.homework.Lesson16;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-20
 */
public class Flat {

    private int number;
    private int roomsNum;
    private List<String> furniture = new ArrayList<>();
    private List<String> technics = new ArrayList<>();

    public Flat(int number, int roomsNum) {
        this.number = number;
        this.roomsNum = roomsNum;
    }

    public int getNumber(){
        return number;
    }

    public int getRoomsNum() {
        return roomsNum;
    }

    public List<String> getFurniture() {
        return furniture;
    }

    public List<String> getTechnics() {
        return technics;
    }

    public void addFurniture(String furniture) {
        this.furniture.add(furniture);
    }

    public void addTechnics(String technics) {
        this.technics.add(technics);
    }

    @Override
    public String toString(){
        return "FlatNumber: " + getNumber() + "\n" +
                "Number of rooms: " + getRoomsNum() + "\n" +
                "Furniture: " + getFurniture() + "\n" +
                "Technics: " + getTechnics();
    }
}
