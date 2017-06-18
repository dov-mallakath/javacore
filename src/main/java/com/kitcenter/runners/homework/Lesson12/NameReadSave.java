package com.kitcenter.runners.homework.Lesson12;

import com.kitcenter.app.classwork.lesson12.FileOperations;

import java.io.IOException;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-18
 */
public class NameReadSave {
    public static void main(String[] args) {

        FileOperations fileOperations = new FileOperations();
        String fileName = fileOperations.setFileName();
        String fileData = fileOperations.getUserInput("exit");
        try {
            fileOperations.writeFile(fileData, fileName);
        } catch (Exception e) {
            System.out.println("file not found, trying to save to default \"output.txt\"...");
            try {
                fileOperations.writeFile(fileData, "output.txt");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
