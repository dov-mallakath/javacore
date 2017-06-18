package com.kitcenter.runners.homework.Lesson13;

import com.kitcenter.app.homework.Lesson13.Human;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-18
 */
public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human("Denys", 30);
        System.out.println(human);
        human.setAge(100500);
        System.out.println(human);
        human.setAge(31);
        System.out.println(human);
    }
}
