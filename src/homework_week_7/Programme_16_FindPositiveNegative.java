package homework_week_7;

import java.util.Scanner;

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number= scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //Closing the scanner object
        scanner.close();

    }
    // Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveNegativeOrZero(int number){
        if(number>0){
            System.out.println(number + "is a positive number");
        }else if(number<0){
            System.out.println(number + "is a negative number");
        }else{
            System.out.println(number +"is Zero");
        }
    }


}
