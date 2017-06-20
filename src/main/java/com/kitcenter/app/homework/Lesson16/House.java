package com.kitcenter.app.homework.Lesson16;

import java.util.List;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-20
 */
public class House {

    private Flat[] flats;

    public House(Flat[] flats) {
        this.flats = flats;
    }

    public Flat[] getFlats() {
        return flats;
    }

    @Override
    public String toString(){
        String house = "";
        for (Flat flat:flats) {
            house += "Flat number: " + flat.getNumber() + "; Number of rooms: " + flat.getRoomsNum() + "\n";
        }
        return house;
    }
}
