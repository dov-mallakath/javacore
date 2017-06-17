package com.kitcenter.runners.classwork.lesson16;

import com.kitcenter.app.classwork.lesson16.LapTop;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-17
 */
public class LapTopRunner {

    public static void main(String[] args) {
        LapTop acer = new LapTop("Acer",4, 4000);
        acer.setColor("black");
        System.out.println(acer);

        LapTop mac = new LapTop("MacBookPro",8, 16000);
        mac.setColor("white");
        System.out.println(mac);

//        LapTop undefined = null;
//
//        NullPointerException
//        System.out.println(undefined.equals(null));
//        System.out.println(null.equals(undefined));
//          NullSafe
        System.out.println(mac.equals(null));
        System.out.println(mac.equals(acer));
        acer.upgrade(8);
        System.out.println(mac.equals(acer));
        acer.upgrade(8,16000);
        System.out.println(mac.equals(acer));
    }

}
