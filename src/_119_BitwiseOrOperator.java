import java.util.Scanner;

public class _119_BitwiseOrOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Bitwise | Operator
         **** Example ****
         *  1100 - 12
         *  0101 -  5
         * ----------
         *  1101 - 13 ans */

        System.out.println("***** Bitwise Or '|' operator ***** \n");

        System.out.print("Enter first number: ");
        int firstOr = input.nextInt();
        System.out.print("Enter second number: ");
        int secondOr = input.nextInt();

        int resultOr = firstOr | secondOr;

        System.out.println("Result is: "+ resultOr);
        System.out.println("\n");
    }
}
