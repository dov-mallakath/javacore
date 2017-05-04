package com.kitcenter.app.homework.lesson4;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-03
 */
public class PrimitiveConvertor {
    private char charVar;

    public char floatToChar(float floatVar) {
        charVar = (char)floatVar;
        System.out.println("Incomming float: "+floatVar);
        System.out.println("Resulting char: "+charVar);
        return charVar;
    }

    public char intToChar(int intVar) {
        charVar = (char)intVar;
        System.out.println("Incomming int: "+intVar);
        System.out.println("Resulting char: "+charVar);
        return charVar;
    }

    public int charToInt(char charVar) {
        int intVar = (int)charVar;
        System.out.println("Incomming char: "+charVar);
        System.out.println("Resulting int: "+intVar);
        return intVar;
    }

}
