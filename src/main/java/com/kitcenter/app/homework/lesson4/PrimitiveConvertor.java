package com.kitcenter.app.homework.lesson4;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-03
 */
public class PrimitiveConvertor {
    private char charVar;

    public void floatToChar(float floatVar) {
        charVar = (char)floatVar;
        //return this.charVar;
        System.out.println("Incomming float: "+floatVar);
        System.out.println("Resulting char: "+charVar);
    }

    public void intToChar(int intVar) {
        charVar = (char)intVar;
        //return this.charVar;
        System.out.println("Incomming int: "+intVar);
        System.out.println("Resulting char: "+charVar);
    }

    public void chartoInt(char charVar) {
        int intVar = (int)charVar;
        //return this.charVar;
        System.out.println("Incomming int: "+charVar);
        System.out.println("Resulting char: "+intVar);
    }

}
