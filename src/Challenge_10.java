import java.util.Scanner;

public class Challenge_10 {
    public static void main(String[] args) {
        // Bitwise Operators

        System.out.println("***** Bitwise And '&' operator *****");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int result = first & second;

        System.out.println("Result is: "+ result);
        System.out.println("\n");

        System.out.println("***** Bitwise Or '|' operator *****");

        System.out.print("Enter first number: ");
        int firstOr = input.nextInt();
        System.out.print("Enter second number: ");
        int secondOr = input.nextInt();

        int resultOr = firstOr | secondOr;

        System.out.println("Result is: "+ resultOr);
        System.out.println("\n");

        System.out.println("***** Bitwise Zor '^' operator *****");

        System.out.print("Enter first number: ");
        int firstZor = input.nextInt();
        System.out.print("Enter second number: ");
        int secondZor = input.nextInt();

        int resultZor = firstZor ^ secondZor;

        System.out.println("Result is: "+ resultZor);
        System.out.println("\n");

        System.out.println("***** Bitwise Not/Compliment '~' operator *****");

        System.out.print("Enter a number: ");
        int firstNot = input.nextInt();


        int resultNot = ~firstNot;

        System.out.println("Result is: "+ resultNot);
        System.out.println("\n");

        System.out.println("***** Bitwise LeftShift '<<' operator *****");

        System.out.print("Enter a number: ");
        int firstLs = input.nextInt();


        int resultLs = firstLs << 1;

        System.out.println("Result is: "+ resultLs);

    }
}

