package homework_week_7;

import java.util.Arrays;

public class Programme_17_SortArray {
    public static void main(String[] args) {
        // Numeric Array declaration
        int[] numArray= {1789,2035,2040,2255,1455,787};
        // string Array declaration
        String strArray[]={"Alpha","Bravo","Delta","Hotel","Mike","Siera","Kilo"};
        System.out.println("Actual numeric Array was :"+ Arrays.toString(numArray));
        //sorting Arrays
        Arrays.sort(numArray);
        System.out.println("Sorted numerical Array is:"+ Arrays.toString(numArray));
        System.out.println(" ");
        System.out.println("Actual String Array was :"+ Arrays.toString(strArray));
        //sorting Array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));
    }


}

