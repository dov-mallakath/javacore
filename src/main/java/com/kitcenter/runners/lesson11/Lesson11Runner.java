package com.kitcenter.runners.lesson11;

import com.kitcenter.app.classwork.lesson11.EnigmaEncoder;

import java.util.Scanner;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-31
 */
public class Lesson11Runner {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String b = "start";
        String c = "finish";

        for(long i=0; i<10000L; i++){
            b=b.concat(c);
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);


        start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("start");

        for(long i=0; i<100000L; i++){
            builder=builder.append(c);
        }

        end = System.currentTimeMillis();
        System.out.println(end-start);


        EnigmaEncoder enigmaEncoder = new EnigmaEncoder();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(enigmaEncoder.encodeString(input));

    }
}
