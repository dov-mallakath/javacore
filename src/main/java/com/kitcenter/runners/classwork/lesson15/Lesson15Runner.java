package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson14.Person;
import com.kitcenter.app.classwork.lesson14.Student;
import com.kitcenter.app.classwork.lesson15.Teacher;
import com.kitcenter.app.classwork.lesson15.Worker;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-14
 */
public class Lesson15Runner {
    public static void main(String[] args) {
        Student student = new Student("Denys", "Kit Center");
        System.out.println(student.getResponse("What is class?"));

        Teacher teacher = new Teacher("Sergey", "Kit Center");
        System.out.println(teacher.getResponse("What time is it now"));

        Person person = new Student("Dmytro","Kit Center");
        System.out.println(person.getResponse("What is class"));

        person = new Teacher("Eugen", "Kit Center");
        System.out.println(person.getResponse("What time is it now?"));

        person = new Person("Noname00");

        Person worker = new Worker("Olekiy");
        System.out.println(worker.getResponse("How are u?"));

        showResponse(person,"What is class?");
        showResponse(person,"What time is it now?");
        showResponse(worker,"How are U");

        System.out.println(student);
    }

    public static void showResponse(Person person, String question){
        System.out.println(person.getResponse(question));
    }
}
