package com.kitcenter.app.classwork.lesson19;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
//public class BoxPrinterGeneric<T extends Number> {
public class BoxPrinterGeneric<T> {

    private T val;

    public BoxPrinterGeneric(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "BoxPrinterGeneric{" +
                "val=" + val +
                '}';
    }
}
