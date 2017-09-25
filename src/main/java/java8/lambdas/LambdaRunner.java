package java8.lambdas;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-09-25
 */
public class LambdaRunner {

    public static void main(String[] args) {

        MethodOperations methodOperations = new MethodOperations();

        int sum = methodOperations.addition.operation(10, 15);
        System.out.println(sum);

        int mult = methodOperations.multiply.operation(10, 15);
        System.out.println(mult);


        MathOperation substruction = (int a, int b) -> a - b;
        int sub = substruction.operation(10, 15);
        System.out.println(sub);

        GreetingService greetingService = message -> System.out.println("Hello " + message);
        greetingService.sayMessage("World");

        CircleArea circleArea = (double pi, double radius) -> pi * radius * radius;
        double area = circleArea.calculateCircleArea(Math.PI, 10.5);
        System.out.println(area);

    }

}
