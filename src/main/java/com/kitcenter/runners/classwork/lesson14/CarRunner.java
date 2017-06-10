package com.kitcenter.runners.classwork.lesson14;

import com.kitcenter.app.classwork.lesson14.BMW;
import com.kitcenter.app.classwork.lesson14.Lexus;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-10
 */
public class CarRunner {
    public static void main(String[] args) {
        Lexus lexus = new Lexus("LX450",200);
        BMW bmw = new BMW("Prototype0251",250);
        System.out.println(lexus.getClassName()+" Model name is:"+lexus.getName()+"; Speed is: "+lexus.getSpeed());
        System.out.println(bmw.getClassName()+" Model name is:"+bmw.getName()+"; Speed is: "+bmw.getSpeed());
        lexus.printNameAndSpeed();
        bmw.printNameAndSpeed();
        lexus.drives();
        bmw.drives();
    }
}
