import java.util.Scanner;

public class _07_relationalOperators {
    public static void main(String[] args) {

        // Relational operators
        // == : Check equality
        // != : Check inequality
        // <  : Less than
        // >  : Greater than
        // <= : Less than or equals to
        // >= : Greater than or equals to

        System.out.println("*** Driving eligibility check ***");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age>=18) {
            System.out.println("You are eligible");
        } else {
            System.out.println("Beta cycle chalao");
        }
    }
}
