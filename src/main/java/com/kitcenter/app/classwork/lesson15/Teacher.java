package com.kitcenter.app.classwork.lesson15;

import com.kitcenter.app.classwork.lesson14.Person;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class Teacher extends Person {
    private String university;

    public Teacher(String name, String university){
        super(name);
        this.university = university;
    }

    @Override
    public String getResponse(String question){
        return "Do not forget to make homework!";
    }
}
