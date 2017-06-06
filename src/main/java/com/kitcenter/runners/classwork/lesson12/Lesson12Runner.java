package com.kitcenter.runners.classwork.lesson12;

import com.kitcenter.app.classwork.lesson10.StringUtils;
import com.kitcenter.app.classwork.lesson12.FileOperations;

import java.io.IOException;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-03
 */
public class Lesson12Runner {

    public static void main(String[] args) throws IOException {

        String input;
        String[] words;
        String palindromes = "";
        StringUtils stringUtils = new StringUtils();
        FileOperations fileOperations = new FileOperations();

        input = fileOperations.readFile("input.txt");
        words = fileOperations.breakToWords(input);
        for(int i=0; i<words.length; i++){
            if (stringUtils.isPalindromeFast(words[i])) {
                palindromes += words[i]+" ";
            }
        }
        fileOperations.writeFile(palindromes, "output.txt");
    }
}
