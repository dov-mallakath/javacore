package com.kitcenter.app.classwork.lesson11;

import java.util.Random;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-31
 */
public class EnigmaEncoder {
    private String plainTest = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqqrstuvwxyz ";
    private String cypherText = "";

//    private String setupCypher(){
//        StringBuilder cypherText = new StringBuilder("");
//        Random random = new Random();
//
//    }


    public static String encodeString(String password){
        String plainTest = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqqrstuvwxyz ";
        String cypherText = "QWERTYUIOPASDFGHJKLZXCVBNM 0123456789qwertyuiopasdfghjklzxcvbnm";
        StringBuilder stringBuilder = new StringBuilder(password);
        String resultString = "";
        String error = "";
        for(int i = 0; i<stringBuilder.length(); i++){
            for (int j=0; j<plainTest.length(); j++){
                if(stringBuilder.charAt(i)==plainTest.charAt(j)){
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
                if(j==plainTest.length()-1){error="You enterd the character that cannot be encoded: " + stringBuilder.charAt(i);}
            }
        }
        if(error == ""){resultString = stringBuilder.toString();}else{resultString = error;}
        return resultString;
    }

    public static String decodeString(String password){
        String plainTest = "QWERTYUIOPASDFGHJKLZXCVBNM 0123456789qwertyuiopasdfghjklzxcvbnm";
        String cypherText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqqrstuvwxyz ";
        StringBuilder stringBuilder = new StringBuilder(password);
        String resultString = "";
        String error = "";
        for(int i = 0; i<stringBuilder.length(); i++){
            for (int j=0; j<plainTest.length(); j++){
                if(stringBuilder.charAt(i)==plainTest.charAt(j)){
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
                if(j==plainTest.length()-1){error="You enterd the character that cannot be encoded: " + stringBuilder.charAt(i);}
            }
        }
        if(error == ""){resultString = stringBuilder.toString();}else{resultString = error;}
        return resultString;
    }

}
