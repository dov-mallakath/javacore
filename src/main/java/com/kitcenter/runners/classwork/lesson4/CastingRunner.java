package com.kitcenter.runners.classwork.lesson4;

import com.kitcenter.app.classwork.lesson4.NarrowingCasting;
import com.kitcenter.app.classwork.lesson4.WideningCasting;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-03
 */
public class CastingRunner {
    public static void main(String[] args) {
        WideningCasting wideningCasting = new WideningCasting();
                wideningCasting.widening();
        NarrowingCasting narrowingCasting = new NarrowingCasting();
            narrowingCasting.narrowing(); // cast from less precise
            //narrowingCasting.narrowingException(); // try to cast to less precise
            narrowingCasting.narrowingCast(); // cast to less precise with JavaCast
            narrowingCasting.doubleToFloat();
    }
}
