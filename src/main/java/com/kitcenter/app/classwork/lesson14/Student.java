package com.kitcenter.app.classwork.lesson14;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-10
 */
public class Student extends Person {
    private String univercity;
    private String response = "Ehhhh, what was the question";

    public Student(String name, String university){
        super(name);
        this.univercity = university;
    }

    public Student(String name, int age, String university){
        super(name,age);
        this.univercity = university;
    }

    @Override
    public String getResponse(String question) {
        return response;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", univercity='" + univercity + '\'' +
                ", response='" + response + '\'' +
                '}';
    }
}
