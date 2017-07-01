package com.kitcenter.app.classwork.lesson19;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public class OrderUtil {

        public static <K, V> boolean compare(OrderPair<K, V> p1, OrderPair<K, V> p2){
            return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
        }

        public static <K> boolean compare(BoxPrinterGeneric<K> bpg1, BoxPrinterGeneric<K> bpg2){
            return bpg1.getVal().equals(bpg2.getVal());
        }

}
