package com.kitcenter.runners.classwork.lesson19;

import com.kitcenter.app.classwork.lesson14.Car;
import com.kitcenter.app.classwork.lesson19.BoxPrinter;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public class BoxPrinterRunner {

    public static void main(String[] args) {
        BoxPrinter boxPrinter = new BoxPrinter(new Integer(10));
        System.out.println(boxPrinter);

        Integer integer = (Integer)boxPrinter.getVal();

        BoxPrinter boxPrinterOne = new BoxPrinter(new String("Hello World"));
        System.out.println(boxPrinterOne);

        //Integer integer2 = (Integer)boxPrinterOne.getVal();

        BoxPrinter boxPrinter1 = new BoxPrinter(new Car("Fiat", 150));
        System.out.println(boxPrinter1);

    }

}
