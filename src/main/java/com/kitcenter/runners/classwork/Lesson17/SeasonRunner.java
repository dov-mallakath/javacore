package com.kitcenter.runners.classwork.Lesson17;

import com.kitcenter.app.classwork.Lesson17.Season;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-21
 */
public class SeasonRunner {

    public static void main(String[] args) {
        Season season = Season.SPRING;

        if (season == Season.SPRING){
            season = Season.SUMMER;
        }

        System.out.println(season.name());
        System.out.println(Season.AUTUMN.name());

        Season season1 = Season.valueOf("SPRING");

        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));

        System.out.println(Season.AUTUMN.toString());

        Scanner scanner = new Scanner(System.in);
        Season season2 = Season.valueOf(scanner.nextLine());

        switch (season2){
            case SPRING:
                System.out.println("Spring is Spring");
                break;
            case SUMMER:
                System.out.println("Summer is hot");
                break;
            case AUTUMN:
                System.out.println("Autumn is tasty");
                break;
            case WINTER:
                System.out.println("Winter is cool");
                break;
            default:
                System.out.println("Wrong input data");
                break;
        }


    }

}
