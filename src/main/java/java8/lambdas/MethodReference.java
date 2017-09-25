package java8.lambdas;

import java.util.Arrays;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-09-25
 */
public class MethodReference {

    public MethodReference() {
        System.out.println("Hello World");
    }

    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {

        // Referring static method
        Sayable sayable = MethodReference::saySomething;
        // Calling interface method
        sayable.say();


        MethodReference methodReference = new MethodReference(); // Creating object
        // Referring non-static method using reference
////        Reference to an Instance Method
        Sayable sayable2 = methodReference::saySomethingMethod;
        // Calling interface method
        sayable2.say();
//
        Sayable sayable3 = MethodReference::new;
//        // Calling interface method
        sayable3.say();
//
//
        //Arbitrary object
        String[] stringArray = {"Barbara", "ames", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);

//
////        Salary and Age
//        Developer devAndroid = new Developer();
//        Developer devIOS = new Developer();
//        Developer devC = new Developer();
//        Developer[] developers = {devAndroid, devIOS, devC};
//        Integer[] intArray = {2, 4, 6, 1, 4};
//        Comparator<Integer> comparatorForInt = (o1, o2) -> {
//            if (o1 > o2) {
//                return 1;
//            } else if (o1 < o2) {
//                return -1;
//            } else
//                return 0;
//        };
//        Comparable<Developer> developerComparable = dev -> {
//            if (dev.id > dev.id) {
//                return 1;
//            } else if (dev.id < dev.id) {
//                return -1;
//            } else
//                return 0;
//        };
//        Arrays.sort(intArray, comparatorForInt);
//        System.out.println(Arrays.toString(intArray));
////        Arrays.stream(stringArray).forEach(s -> System.out.println(s));
    }

    public void saySomethingMethod() {
        System.out.println("Hello, this is not static method.");
    }


}
