package com.kitcenter.runners.homework.Lesson15;

import com.kitcenter.app.homework.Lesson15.Flower;
import com.kitcenter.app.homework.Lesson15.SetOfFlowers;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-19
 */
public class FlowersRunner {

    public static void main(String[] args) {

        Flower roseR = new Flower("red",100,40);
        Flower roseW = new Flower("white",80,35);
        Flower daisy = new Flower("yellow",20,5);

        roseR.setCount(3);
        roseW.setCount(4);
        daisy.setCount(24);

        Flower[] flowers = {roseR,roseW,daisy};

        SetOfFlowers setOfFlowers = new SetOfFlowers(flowers);

        System.out.println(setOfFlowers);
    }

}
