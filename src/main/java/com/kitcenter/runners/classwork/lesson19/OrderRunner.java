package com.kitcenter.runners.classwork.lesson19;

import com.kitcenter.app.classwork.lesson19.OrderPair;
import com.kitcenter.app.classwork.lesson19.OrderUtil;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public class OrderRunner {

    public static void main(String[] args) {
        OrderPair<String, Integer> p1 = new OrderPair<>("Even", 8);
        OrderPair<String, Integer> p2 = new OrderPair<>("Odd", 11);
        System.out.println(p1);

        boolean sameNot = OrderUtil.compare(p1,p2);
        boolean same = OrderUtil.compare(p1,p1);
        System.out.println(sameNot);
        System.out.println(same);

    }

}
