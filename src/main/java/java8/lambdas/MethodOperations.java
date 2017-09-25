package java8.lambdas;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-09-25
 */
public class MethodOperations {

    MathOperation addition = (int a, int b) ->
    {
        int sum = a + b;
        int mult = b * a;
        return sum + mult;
    };


    MathOperation multiply = (int a, int b) -> a * b;


}
