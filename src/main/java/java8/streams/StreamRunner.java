package java8.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-09-25
 */
public class StreamRunner {

    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("XML", "Java", "CSS", "SQL");


        arrayList.stream().forEach(item -> System.out.println(item));

        arrayList.stream().forEach(System.out::println);
        System.out.println("=================================");
        arrayList.stream().forEachOrdered(System.out::println);

        arrayList.stream().forEach(StreamRunner::showMessage);


        int[] count = {1,3,5,7};
        Arrays.stream(count).forEach(StreamRunner::showMessage);

        Arrays.stream(count).forEach(item -> {
            Integer itemMultiplied = item * 2;
            System.out.println(itemMultiplied);
        });

        int sum = Arrays.stream(count).reduce(0, Integer::sum);
    }

    public static void showMessage(String message){
        System.out.println(message);
    }

    public static void showMessage(int message){
        System.out.println(message);
    }

}
