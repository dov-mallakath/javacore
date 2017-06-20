package com.kitcenter.runners.homework.Lesson16;

import com.kitcenter.app.homework.Lesson16.Tracktor;
import com.kitcenter.app.homework.Lesson16.WheeledTracktor;
import com.kitcenter.app.homework.Lesson16.ChainedTraktor;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-20
 */
public class TraktorRunner {

    public static void main(String[] args) {
        Tracktor wheeledTracktor = new WheeledTracktor("Belarus", 15);
        Tracktor chainedTraktor = new ChainedTraktor("KMZ",5);

        wheeledTracktor.printName();
        System.out.println(wheeledTracktor);
        chainedTraktor.printName();
        System.out.println(chainedTraktor);
    }

}
