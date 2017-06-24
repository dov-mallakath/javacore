package com.kitcenter.app.classwork.Lesson18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-24
 */
public class PhoneBook {

    private Map phoneBook = new HashMap();

    public void addRecord(String name, String number){
        HashMap record = (HashMap)phoneBook.get(getFirstLetter(name));
        if(record!=null) {
            record.put(name, number);
            phoneBook.put(getFirstLetter(name), record);
        }else{
            HashMap recordNew = new HashMap();
            recordNew.put(name,number);
            phoneBook.put(getFirstLetter(name), recordNew);
        }
    }

    private String getFirstLetter(String name){
        return String.valueOf(name.charAt(0)).toUpperCase();
    }

    public HashMap getRecordsByLetter(String letter){
        HashMap record = (HashMap)phoneBook.get(letter);
        return record;
    }

}
