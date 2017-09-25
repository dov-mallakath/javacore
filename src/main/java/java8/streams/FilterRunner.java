package java8.streams;

import java8.streams.employee.Employee;
import java8.streams.employee.Gender;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.time.Month.JULY;
import static java8.streams.employee.Employee.persons;
import static java8.streams.employee.Gender.MALE;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-09-25
 */
public class FilterRunner {

    public static void main(String[] args) {

        persons()
                .stream()
                .filter(employee -> employee.getId() > 3)
        .forEach(System.out::println);


        Predicate<Employee> employeePredicate = employee -> employee.getId() > 3;
        persons()
                .stream()
                .filter(employeePredicate)
                .forEach(System.out::println);

        persons()
                .stream()
                .filter(employee -> employee.getIncome() > 3000)
                .forEach(System.out::println);

        boolean allMalesOne = persons().stream()
                .allMatch(employee -> employee.getGender() == MALE);

        boolean allMales = persons().stream()
                .allMatch(Employee::isMale);

        boolean anyoneJuly = persons().stream()
                .anyMatch(employee -> employee.getDob().getMonth() == JULY);


        List<Double> salary = new ArrayList<>();
        persons().stream().forEach(employee -> salary.add(employee.getIncome()));
        Double salaryAll = salary.stream().reduce(Double::sum).get();

        Double salaryAllOne = persons().stream().map(employee -> employee.getIncome()).reduce(Double::sum).get();
        Double salaryAllwo = persons().stream().map(Employee::getIncome).reduce(Double::sum).get();

        Optional<Double> salaryAllThree = persons().stream().map(Employee::getIncome).reduce(Double::sum);
        salaryAllThree.ifPresent(System.out::println);

        List<Employee> filteredList = persons()
                .stream().filter(employeePredicate).collect(Collectors.toList());

    }

}
