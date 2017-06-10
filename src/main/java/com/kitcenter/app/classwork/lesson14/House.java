package com.kitcenter.app.classwork.lesson14;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-10
 */
public class House {
    private Flat[] flats;
    private Parking[] parkings;
    public House(Flat[] flats) {
        this.flats = flats;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public House(Flat[] flats, Parking[] parkings){
        this(flats);
        this.parkings = parkings;
    }

    public Parking[] getParkings() {
        return parkings;
    }
}
