import java.util.Scanner;

public class Challenge_06 {
    public static void main(String[] args) {
        //Number is positive, negative or zero

        Scanner input = new Scanner(System.in);
        System.out.println("****Number Check****");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num == 0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Number is negative");
        }
        // Odd Even check
        System.out.println("****** ODD or Even ******" );
        System.out.print("Enter a number:");
        int num2 = input.nextInt();

        if (num2 % 2 == 0) {
            System.out.println("Your number is even!");
        }else {
            System.out.println("Your number is odd!");
        }
        // Find greatest of three

        System.out.println("*****Greatest of Three*****");
        System.out.print("Enter 1st number: ");
        int first = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int second = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println("1st number is greatest: " + first);
        } else if (second >= third) {
            System.out.println("2nd number is greatest: " + second);
        } else {
            System.out.println("3rd number is greatest: " + third);
        }

    }
}
