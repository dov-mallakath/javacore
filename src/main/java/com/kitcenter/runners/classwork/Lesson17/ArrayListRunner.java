package com.kitcenter.runners.classwork.Lesson17;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-21
 */
public class ArrayListRunner {

    public static void main(String[] args) {

        String techLead = "Dimon";
        String devOne = "Rusik";
        String devTwo = "Andryushka";
        String devThree = "Sashok";
        String qaOld = "Sashok";
        String qaNew = "Denys";


        ArrayList<String> arrayList = new ArrayList<>(5);
        arrayList.add(devOne);
        arrayList.add(devTwo);
        arrayList.add(0,techLead);
        arrayList.add(devThree);
        arrayList.add(qaOld);
        System.out.println(arrayList.indexOf("Sashok"));
        System.out.println(arrayList);
        arrayList.set(arrayList.size()-1,qaNew);
        int size = arrayList.size();
        System.out.println(size);

        System.out.println(arrayList);

        System.out.println(arrayList.contains("Denys"));

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

}
