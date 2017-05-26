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

    public void printAlignRight(int[][] multyArray){
        int maxShift = maxShift(multyArray);
        for (int i=0; i<multyArray.length; i++){
            for (int c=0; c<multyArray[i].length; c++){
                System.out.print(buildShift(multyArray[i][c],maxShift)+multyArray[i][c]+" ");
            }
            System.out.println();
        }
    }

    private int maxShift(int[][] multyArray){
        int max=multyArray[0][0];
        for(int i=0; i<multyArray.length; i++){
            if(getMax(multyArray[i])>=max){max=getMax(multyArray[i]);}
        }
        int length = String.valueOf(max).length();
        return length-1;
    }

    private String buildShift(int element, int maxShift){
        String shift = "";
        int elementLength = String.valueOf(element).length();
        for(int i=0; i<=maxShift-elementLength; i++){
            shift = shift + " ";
        }
        return shift;
    }

    public void print(int[] multyArray, String separator){
        for (int i=0; i<multyArray.length; i++){
                System.out.print(multyArray[i]+separator);
            }
            System.out.println();
        }

    public void printReverse(int[] multyArray, String separator){
        for (int i=multyArray.length-1; i>=0; i--){
            System.out.print(multyArray[i]+separator);
        }
        System.out.println();
    }

    public void print(int[] multyArray){
        for (int i=0; i<multyArray.length; i++){
            System.out.print(multyArray[i]);
        }
        System.out.println();
    }

    public int getMax(int[] array){
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>=max){max=array[i];}
        }
        return max;
    }

    public int getMin(int[] array){
        int min = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]<=min){min=array[i];}
        }
        return min;
    }
}
