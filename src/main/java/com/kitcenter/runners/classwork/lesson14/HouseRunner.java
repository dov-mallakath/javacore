package com.kitcenter.runners.classwork.lesson14;

import com.kitcenter.app.classwork.lesson14.Flat;
import com.kitcenter.app.classwork.lesson14.House;
import com.kitcenter.app.classwork.lesson14.Parking;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-10
 */
public class HouseRunner {
    public static void main(String[] args) {
        Flat[] flats = new Flat[3];
        Flat flat187 = new Flat();
        Flat flat188 = new Flat();
        Flat flat189 = new Flat();
        flats[0] = flat187;
        flats[1] = flat188;
        flats[2] = flat189;
        House house = new House(flats);
        Flat[] houseFlats = house.getFlats();
        for(Flat flat : houseFlats){
            flat.setItem("Standard doors");
        }
        Flat houseFlat187 = houseFlats[0];
        houseFlat187.setItem("Armored doors");
        for(Flat flat : houseFlats){
            System.out.println(flat.getItem());
        }


        Parking[] parkings = new Parking[2];
        Parking parkingA = new Parking();
        Parking parkingsB = new Parking();
        parkings[0] = parkingA;
        parkings[1] = parkingsB;
        House eliteHouse = new House(flats,parkings);
        Flat[] eliteHouseFlats = eliteHouse.getFlats();
        Parking[] eliteHouseParkings = eliteHouse.getParkings();

        for(Flat flat : eliteHouseFlats){
            flat.setItem("Armored doors");
        }
        for(Parking parking : eliteHouseParkings){
            parking.setItem("Basic parking");
        }
        Parking underground = eliteHouseParkings[0];
        underground.setItem("Underground parking");

        for(Flat flat : eliteHouseFlats){
            System.out.println(flat.getItem());
        }

        for(Parking parking : eliteHouseParkings){
            System.out.println(parking.getItem());
        }

    }
}
