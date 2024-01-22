import java.util.Scanner;

public class _122_BitwiseLeftShiftOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***** Bitwise LeftShift '<<' operator ***** \n");

        /* Bitwise & Operator
         **** Example ****
         *  12 = 1100 << 1 = 1000 - 8 ans.
         *  4  = 0100 << 1 = 1000 - 8 ans */

        System.out.print("Enter a number: ");
        int firstLs = input.nextInt();


        int resultLs = firstLs << 1;

        System.out.println("Result is: "+ resultLs);

    }
}
