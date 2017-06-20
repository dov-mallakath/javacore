package com.kitcenter.runners.homework.Lesson16;

import com.kitcenter.app.homework.Lesson16.Flat;
import com.kitcenter.app.homework.Lesson16.House;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-20
 */
public class HouseRunner {

    public static void main(String[] args) {
        Flat flatOne = new Flat(59,2);
        Flat flatTwo = new Flat(60,1);
        flatOne.addFurniture("Big bed");
        flatOne.addFurniture("Wardrobe");
        flatOne.addTechnics("Fridge");
        flatOne.addTechnics("Notebook");
        System.out.println(flatOne);
        System.out.println(flatTwo);
        Flat[] flats = {flatOne, flatTwo};
        House house = new House(flats);
        System.out.println(house);

    }

}
