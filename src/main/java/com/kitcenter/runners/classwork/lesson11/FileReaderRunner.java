package com.kitcenter.runners.classwork.lesson11;

import com.kitcenter.app.classwork.lesson11.FileReaderNew;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-31
 */
public class FileReaderRunner {
    public static void main(String[] args) {
        FileReaderNew fileReaderNew = new FileReaderNew();
        String readedFile = fileReaderNew.readFile();
    }
}
