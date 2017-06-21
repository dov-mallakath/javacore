package com.kitcenter.app.classwork.Lesson17;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-21
 */
public enum Holidays {

    NEW_YEAR(1,"January","New Year"), CHRISTMAS(7,"January","Christmas"), INDEPENDANCE_DAY(24,"August","Independance Day");

    private int date;
    private String month;
    private String name;

    Holidays(int date, String month, String name) {
        this.date = date;
        this.month = month;
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return getName() + " holiday is usually celebrated on " + getMonth() +", " + getDate();
    }
}
