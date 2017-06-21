package com.kitcenter.app.classwork.Lesson17;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-21
 */
public enum Company {

    EBAY(30,"Ebay Inc."), GOOGLE(10, "Google Inc.");
    private int value;
    private String fullName;

    Company(int value, String fullName) {
        this.value = value;
        this.fullName = fullName;
    }

    public int getValue() {
        return value;
    }

    public String getFullName() {
        return fullName;
    }
}
