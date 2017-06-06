package com.kitcenter.app.classwork.lesson12;

import java.io.*;
import java.net.URL;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-03
 */
public class FileOperations {
    String currentDir = System.getProperty("user.dir");

    public String readFile(String path) throws IOException {
        String line = "";
        String output = "";
        //String uri = createAbsolutePath(currentDir, path);
        String uri = getPath(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(uri));
        while ((line = bufferedReader.readLine())!=null) {
            System.out.println(line);
            output += line + "\n";
        }
        bufferedReader.close();
        return output;
    }

    public String[] breakToWords(String input){
        input = input.replaceAll("\n"," ");
        String[] words = input.split(String.valueOf(" "));
        return words;
    }

    public void writeFile(String output, String path) throws IOException{
        //String uri = createAbsolutePath(currentDir, path);
        String uri = getPath(path);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(uri)
                ));
        System.out.println(output);
        writer.append(output);
        writer.newLine();
        writer.close();
    }
@Deprecated
    public String getAbsolutePath(String relativePath){
        String filePath;
        String linuxStyle = currentDir + relativePath;
        String windowsStyle = currentDir + relativePath;
        filePath = linuxStyle;
        System.out.println(filePath);
        return filePath;
    }
@Deprecated
    public String createAbsolutePath(String project, String relatedToProject){
        File file = new File(project, relatedToProject);
        return file.getAbsolutePath();
    }

    public String getPath(String fileName){
        String path = null;
        URL url = this.getClass().getClassLoader().getResource(fileName);
        if (url != null){
            path = url.getPath();
        } else {
            System.out.println("Resources not found");
        }
        return path;
    }
}
