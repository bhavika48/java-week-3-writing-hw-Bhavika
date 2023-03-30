package homework_week_7;

public class Programme_11_DividedByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are: ");
        for (int i = 1; i <= 100; i++) {
            dividedByThree(i);
        }

        System.out.println("\n----------------------------------");
        System.out.println("Number divisible by 5 area ");
        for (int x = 1; x <= 100; x++) {
            dividedByFive(x);
        }
    }

    // divided by three method
    public static void dividedByThree(int number) {
        if (number % 3 == 0) {
            System.out.println(number + ",");
        }
    }

    // divided by five method
    public static void dividedByFive(int number) {

        if (number % 5 == 0) {
            System.out.println((number + ","));
        }
    }
}


