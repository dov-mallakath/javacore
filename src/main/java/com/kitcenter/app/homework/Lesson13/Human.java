package com.kitcenter.app.homework.Lesson13;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-18
 */
public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age<=120 && age >=1) {
            this.age = age;
            System.out.println("New age setted: " + age);
        } else {
            System.out.println("Age invalid");
        }
    }

    @Override
    public String toString(){
        return "Name is: " + getName() + "\n" + "Age is: " + getAge();
    }
}
