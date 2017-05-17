package com.kitcenter.runners.classwork.lesson8;

import com.kitcenter.app.classwork.lesson5.Car;
import com.kitcenter.app.classwork.lesson8.ArrayUtil;
import com.kitcenter.app.classwork.lesson8.Flat;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-17
 */
public class ArrayRunner {
    public static void main(String[] args) {
        int[] listOfInteger = {11,20,5,70};
        int[] listOfIntegerInit = new int[4];
        listOfIntegerInit[0] = 100500;
        listOfIntegerInit[1] = 110500;
        listOfIntegerInit[2] = 101500;
        listOfIntegerInit[3] = 100100;
        listOfIntegerInit[0] = 123;
        System.out.println(listOfIntegerInit[0]);

        for (int item: listOfInteger){
            System.out.println(item);
        }

        for (int i=0; i<listOfInteger.length; i++){
            System.out.println(listOfInteger[i]);
        }

        Car[] cars = new Car[2];
        Car bmw = new Car();
        bmw.name = "BMW";
        Car zaz = new Car();
        zaz.name = "ZAZ";

        cars[0] = bmw;
        cars[1] = zaz;

        for (Car car : cars){
            System.out.println(car.name);
        }

        Random random = new Random();

        double[] doubles = new double[4];

        for (int iterator=0; iterator<doubles.length; iterator++){
            doubles[iterator] = random.nextDouble();
            System.out.println(doubles[iterator]);
        }

        Flat flat = new Flat();
        flat.setAdress("private adress");
        Flat flatOne = new Flat();
        flatOne.setAdress("private adress one");
        Flat flatTwo = new Flat();
        flatTwo.setAdress("private adress two");


        Flat[] flats = {flat, flatOne, flatTwo};


        for(Flat thisIsMyFlat : flats){
            System.out.println("This is my flat adress:");
            System.out.println(thisIsMyFlat.getAdress());
        }


//        int[][] multyArray = new int[2][3];
//        int increment=1;
//        for (int i=0; i<multyArray.length; i++){
//            for (int c=0; c<multyArray[i].length; c++){
//                multyArray[i][c]=increment;
//                increment++;
//            }
//        }

        ArrayUtil arrayUtil = new ArrayUtil();
        int[][] multyArray = arrayUtil.createAndFill(2,3);
        arrayUtil.print(multyArray);

        System.out.println(Arrays.deepToString(multyArray));

        ArrayUtil arrayUtilOne = new ArrayUtil();
        int[] multyArrayOne = arrayUtilOne.createAndFill(5);
        arrayUtil.print(multyArrayOne);



        int[][] multiDimentionalEmpty = new int[2][];
        multiDimentionalEmpty[0] = new int[3];
        multiDimentionalEmpty[0] = new int[4];

        int[][] multiDimentionalFull = new int[2][];
        multiDimentionalFull[0] = new int[]{2,3,5};
        multiDimentionalFull[0] = new int[]{2,3,4,5};

//        for (int[] row : multyArray){
//            for (int column : row){
//                System.out.println(multyArray[row[column-1]][column-1]);
//            }
//        }
    }
}
