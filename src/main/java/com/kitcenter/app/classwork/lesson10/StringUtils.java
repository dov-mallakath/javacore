package com.kitcenter.app.classwork.lesson10;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-27
 */
public class StringUtils {

    public boolean isPalindrome(String input){
        boolean isPalindrome=false;
        String inputReversed = new StringBuilder(input).reverse().toString();
        if(input.equals(inputReversed)){isPalindrome=true;}
        return isPalindrome;
    }

    public boolean isPalindromeFast(String input){
        boolean isPalindrome=true;
        int length = input.length()-1;
        for(int i=0; i<input.length()/2; i++){
            if(input.charAt(i)!=input.charAt(length-i)){
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }

    public boolean isPalindromeSuperFast(String input){
        StringBuilder builder = new StringBuilder(input);
        boolean isPalindrome=true;
        int length = input.length()-1;
        for(int i=0; i<input.length()/2; i++){
            if(input.charAt(i)!=input.charAt(length-i)){
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }
}
