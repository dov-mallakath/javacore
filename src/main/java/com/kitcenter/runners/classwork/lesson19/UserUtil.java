package com.kitcenter.runners.classwork.lesson19;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public class UserUtil {

    public static <T> void addInfo(User<T> user) {
        user.setInfo("777");
    }
}
