package com.kitcenter.runners.classwork.Lesson17;

import com.kitcenter.app.classwork.Lesson17.Holidays;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-21
 */
public class HolidaysRunner {

    public static void main(String[] args) {
        for (Holidays holiday: Holidays.values()) {
            System.out.println(holiday);
        }
    }

}
