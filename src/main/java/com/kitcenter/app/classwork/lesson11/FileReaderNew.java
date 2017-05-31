package com.kitcenter.app.classwork.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-31
 */
public class FileReaderNew {

    public String readFile() {
        BufferedReader reader = null;
        StringBuffer file = new StringBuffer("");
        try {
            reader = new BufferedReader(
                    new FileReader("/media/innos/Study/javacore/src/main/resources/input.txt")
            );

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                file.append(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {e.printStackTrace();
        } catch (IOException e) {e.printStackTrace();
        } finally {
            System.out.println("The file was read");
        }
        return file.toString();
    }

}
