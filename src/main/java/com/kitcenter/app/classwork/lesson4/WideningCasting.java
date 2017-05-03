package com.kitcenter.app.classwork.lesson4;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-03
 */
public class WideningCasting {
    private byte byteOne = 127;
    private short shortOne = 0;
    private int intOne = 0;
    private long longOne = 0L;
    private float floatOne = 0.0f;
    private double doubleOne = 0.0d;
    //correct conversion 64f<=32f<=64<=32<=16<=8

    public void widening() {
        doubleOne = floatOne = longOne = intOne = shortOne = byteOne;
        System.out.println(doubleOne);
    }
}