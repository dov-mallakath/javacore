package com.kitcenter.runners.homework.Lesson12;

import com.kitcenter.app.classwork.lesson12.FileOperations;
import com.kitcenter.app.homework.lesson11.ArrayParser;

import java.io.IOException;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-11
 */
public class ReadSortWrite {
    public static void main(String[] args)  throws IOException {
        String input;
        FileOperations fileOperations = new FileOperations();

        input = fileOperations.readFile("array.txt");
        ArrayParser arrayParser = new ArrayParser();
        arrayParser.setSeparator(";");
        arrayParser.setSorting("DSC");
        arrayParser.getUserArrayInput(input);
        String sortedArray = String.valueOf(arrayParser.sortArray(input));

        fileOperations.writeFile(sortedArray, "arraySorted.txt");
    }
}
