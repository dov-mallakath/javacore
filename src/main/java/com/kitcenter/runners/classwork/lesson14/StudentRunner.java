package com.kitcenter.runners.classwork.lesson14;

import com.kitcenter.app.classwork.lesson14.Student;

import java.util.Scanner;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-10
 */
public class StudentRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        Student student = new Student("Ivan", 18, "KPI");
        System.out.println(student.getResponse(question));
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
