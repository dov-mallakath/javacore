package com.kitcenter.runners.homework.Lesson14;

import com.kitcenter.app.homework.Lesson14.WhiteCollar;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-19
 */
public class WhiteCollarRunner {
    public static void main(String[] args) {
        WhiteCollar whiteCollar = new WhiteCollar("Denys", 31, "JSC Brokbusinessbank");
        System.out.println(whiteCollar);
        whiteCollar.setCompanyName("Worldtіcket");
        whiteCollar.setCompanyName("Worldtickеt");
        whiteCollar.setCompanyName("Worldtickеt.dat");
        whiteCollar.setCompanyName("Worldtickеt1");
        whiteCollar.setCompanyName("Worldticket");
        System.out.println(whiteCollar);
    }
}
