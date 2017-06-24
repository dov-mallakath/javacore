package com.kitcenter.runners.classwork.Lesson18;

import com.kitcenter.app.classwork.Lesson18.PhoneBook;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-24
 */
public class Lesson18Runner {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("A");
        hs.add("C");
        hs.add("B");
        System.out.println(hs); // [A, B, C, D]

        Map mapa = new HashMap();
        mapa.put("Key", "Value");
        mapa.put(null, "NullKey");
        mapa.put("nullValue", null);
        mapa.put("Key","ValueNew");
        mapa.put(null, "NullKeyNew");
        mapa.put("B","B"); //same as HashSet hs new HashSet(); hs.add("B")
        System.out.println(mapa);

        Map mapaIntKeys = new HashMap();
        mapaIntKeys.put(0,"0");
        mapaIntKeys.put(2,"2");
        mapaIntKeys.put(1,"1");
        System.out.println(mapaIntKeys);

        PhoneBook myBook = new PhoneBook();
        myBook.addRecord("Denys","+1234567");
        System.out.println(myBook);
        System.out.println(myBook.getRecordsByLetter("D"));
    }

}
