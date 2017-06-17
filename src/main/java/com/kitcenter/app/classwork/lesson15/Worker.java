package com.kitcenter.app.classwork.lesson15;

import com.kitcenter.app.classwork.lesson14.Person;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class Worker extends Person {
    String specialization = "";
    public Worker(String name, String specialization){
        super(name);
        this.specialization = specialization;
    }

    public Worker(String name){
        super(name);
    }

    @Override
    public String getResponse(String question){
        return "I'm busy now, ask later";
    }
}
