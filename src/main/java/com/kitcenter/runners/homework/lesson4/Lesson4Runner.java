package com.kitcenter.runners.homework.lesson4;

import com.kitcenter.app.homework.lesson4.PrimitiveConvertor;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-03
 */
public class Lesson4Runner {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar(42.1456f);
        primitiveConvertor.intToChar(33);
        primitiveConvertor.chartoInt('b');
    }
}
