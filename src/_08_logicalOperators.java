import java.util.Scanner;

public class _08_logicalOperators {
    public static void main(String[] args) {

        /*Logical Operators
                Types: &&=and, ||=or, !=not
                Problem: Ticket Discount
                age < 5 75% discount,
                age > 60 25% discount,
                isFemale = true 50% discount.
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Ticket Discount Calculator");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you a female? true/false: ");
        boolean isFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("75% Discount");
        } else if (isFemale) {
            System.out.println("50% Discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("25% Discount");
        } else {
            System.out.println("No Discount");
        }


    }
}
