import java.util.Scanner;

public class _120_BitwiseXorOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Bitwise ^ Xor Operator
         **** Example ****
         *  1100 - 12
         *  0101 -  5
         * ----------
         *  1001 - 9 ans */

        System.out.println("***** Bitwise Xor '^' operator ***** \n");

        System.out.print("Enter first number: ");
        int firstZor = input.nextInt();
        System.out.print("Enter second number: ");
        int secondZor = input.nextInt();

        int resultZor = firstZor ^ secondZor;

        System.out.println("Result is: "+ resultZor);
    }
}
