package com.kitcenter.app.classwork.lesson8;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-05-17
 */
public class ArrayUtil {

    public int[][] createAndFill(int rows, int columns){
        int[][] resultingArray = new int[rows][columns];
        int increment=1;
        for (int i=0; i<resultingArray.length; i++){
            for (int c=0; c<resultingArray[i].length; c++){
                resultingArray[i][c]=increment;
                increment++;
            }
        }
        return resultingArray;
    }

    public int[] createAndFill(int rows){
        int[] resultingArray = new int[rows];
        int increment=1;
        for (int i=0; i<resultingArray.length; i++){
            resultingArray[i]=increment;
            increment++;
        }
        return resultingArray;
    }

    public void print(int[][] multyArray){
        for (int i=0; i<multyArray.length; i++){
            for (int c=0; c<multyArray[i].length; c++){
                System.out.print(multyArray[i][c]+" ");
            }
            System.out.println();
        }
    }

    public void print(int[] multyArray){
        for (int i=0; i<multyArray.length; i++){
                System.out.print(multyArray[i]+" ");
            }
            System.out.println();
        }
}
