package com.kitcenter.runners.classwork.lesson19;

import com.kitcenter.app.classwork.lesson14.Car;
import com.kitcenter.app.classwork.lesson19.BoxPrinterGeneric;
import com.kitcenter.app.classwork.lesson19.OrderUtil;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public class BoxPrinterGenericRunner {

    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> boxPrinterGeneric = new BoxPrinterGeneric<>(10);
        Integer integer = boxPrinterGeneric.getVal();
        System.out.println(boxPrinterGeneric);

        BoxPrinterGeneric<Integer> boxPrinterGeneric1 = new BoxPrinterGeneric<>(15);
        Integer integer1 = boxPrinterGeneric1.getVal();
        System.out.println(boxPrinterGeneric1);

        BoxPrinterGeneric<String> boxPrinterGenericString = new BoxPrinterGeneric<>("10");
        String string = boxPrinterGenericString.getVal();
        System.out.println(boxPrinterGenericString);

        BoxPrinterGeneric<Car> boxPrinterCar = new BoxPrinterGeneric<>(new Car("Fiat", 150));
        Car car = boxPrinterCar.getVal();
        System.out.println(boxPrinterCar);

        System.out.println(OrderUtil.compare(boxPrinterGeneric,boxPrinterGeneric1));
        System.out.println(OrderUtil.compare(boxPrinterCar, new BoxPrinterGeneric<>(new Car("Fiat", 150))));
    }

}
