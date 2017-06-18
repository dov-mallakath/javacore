package com.kitcenter.runners.homework.Lesson12;

import com.kitcenter.app.classwork.lesson10.StringUtils;
import com.kitcenter.app.classwork.lesson12.FileOperations;

import java.io.IOException;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-18
 */
public class IsPalindromeCheck {

    public static void main(String[] args) throws IOException {

        String input;
        String[] words;
        String palindromes[];
        StringUtils stringUtils = new StringUtils();
        FileOperations fileOperations = new FileOperations();

        input = fileOperations.readFile("input.txt");
        words = fileOperations.breakToWords(input);
        fileOperations.printWords(words,"\n");

        palindromes = fileOperations.isPalindromeCheck(words," is palindrome");

        fileOperations.writeFile(palindromes, "output.txt");
    }

}
