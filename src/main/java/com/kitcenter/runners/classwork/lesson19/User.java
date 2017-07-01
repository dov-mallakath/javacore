package com.kitcenter.runners.classwork.lesson19;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public class User<T> {

    private T user;

    private Info uInfo;

    public User(T user) {
        this.user = user;
        uInfo = new Info();
    }

    public void setInfo(String id){
        uInfo.id = id;
    }
}
