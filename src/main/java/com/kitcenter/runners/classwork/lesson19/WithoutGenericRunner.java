package com.kitcenter.runners.classwork.lesson19;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public class WithoutGenericRunner {
    static String[] strings = new String[3];
    static Integer[] integers = new Integer[3];
    public static void main(String[] args) {
        add("String");
        add(777);
        System.out.println(strings[0] + integers[0].toString());
    }

    public static void add(String value){
        strings[0] = value;
    }

    public static void add(Integer value){
        integers[0] = value;
    }
}
