import java.util.Scanner;

public class Challenge_07 {
    public static void main(String[] args) {
        // Find out leap year

        System.out.println("*****  Leap Year Finder  *****");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
