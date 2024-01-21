import java.util.Scanner;

public class _120_BitwiseZorOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***** Bitwise Zor '^' operator ***** \n");

        System.out.print("Enter first number: ");
        int firstZor = input.nextInt();
        System.out.print("Enter second number: ");
        int secondZor = input.nextInt();

        int resultZor = firstZor ^ secondZor;

        System.out.println("Result is: "+ resultZor);
    }
}
