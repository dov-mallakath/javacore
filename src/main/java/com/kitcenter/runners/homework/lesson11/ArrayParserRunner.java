package com.kitcenter.runners.homework.lesson11;

import com.kitcenter.app.homework.lesson11.ArrayParser;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-01
 */
public class ArrayParserRunner {
    public static void main(String[] args) {
        ArrayParser arrayParser = new ArrayParser();
        arrayParser.setSeparator();
        arrayParser.setSorting();
        String input = arrayParser.getUserArrayInput();
        System.out.println(arrayParser.sortArray(input));
        System.out.println(arrayParser.getAlphabetFromInput(input));
        arrayParser.printInputLinesBySeparator(input);
    }
}
