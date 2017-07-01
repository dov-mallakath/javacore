package com.kitcenter.app.homework.lesson17;

import java.util.Calendar;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public enum Persons {

    TRUMP("Donald Trump",new Calendar.Builder().setFields(Calendar.YEAR,1946, Calendar.MONTH,Calendar.JUNE, Calendar.DATE,14).build(),true),
    PUTIN("Vladimit Putin",new Calendar.Builder().setFields(Calendar.YEAR,1952, Calendar.MONTH,Calendar.OCTOBER, Calendar.DATE,7).build(),true),
    STALIN("Iosif Stalin",new Calendar.Builder().setFields(Calendar.YEAR,1878, Calendar.MONTH,Calendar.DECEMBER, Calendar.DATE,18).build(),false),
    ADOLF("Adolf Hitler",new Calendar.Builder().setFields(Calendar.YEAR,1889, Calendar.MONTH,Calendar.APRIL, Calendar.DATE,20).build(),false);
    //TRUMP("Donald Trump",new Calendar.Builder().setDate(1946,6,14).build(),true);

    private String name;
    private Calendar birthDay;
    private boolean isAlive;

    Persons(String name, Calendar birthDay, boolean isAlive) {
        this.name = name;
        this.birthDay = birthDay;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthDay() {
        return birthDay;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
