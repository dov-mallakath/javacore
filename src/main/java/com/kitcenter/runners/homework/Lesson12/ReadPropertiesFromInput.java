package com.kitcenter.runners.homework.Lesson12;

import com.kitcenter.app.classwork.lesson12.FileOperations;

import java.io.IOException;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-18
 */
public class ReadPropertiesFromInput {
    public static void main(String[] args) throws IOException {
        FileOperations fileOperations = new FileOperations();
        System.out.println("Enter lines with properties, separated by \",\". Wrong lines will be ignored. To save the file - [ress enter on the new line.");
        String fileData = fileOperations.getUserInput("");
        fileOperations.writeFile(fileOperations.parseProperties(fileData),"output.txt");
    }
}
