package com.kitcenter.app.classwork.lesson4;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-03
 */
public class NarrowingCasting {
    private int intOne = 127;
    private int intTwo = 0;
    private float floatOne = 0.0f;
    private float floatTwo = 3.14159f;
    private float doubleOne = 3.14159f;

    public void narrowing() {
        floatOne = intOne;
        System.out.println(floatOne);
    }
/*
    public void narrowingException() {
        intOne = floatOne;
        System.out.println(intOne);
    }
*/
    public void narrowingCast() {
        intTwo = (int)floatTwo;
        System.out.println(intTwo);
    }

    public void doubleToFloat() {
        floatOne = doubleOne;
        System.out.println(floatOne);
    }

}
