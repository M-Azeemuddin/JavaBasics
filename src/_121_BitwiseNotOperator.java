import java.util.Scanner;

public class _121_BitwiseNotOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***** Bitwise Not/Compliment '~' operator ***** /n");

        System.out.print("Enter a number: ");
        int firstNot = input.nextInt();


        int resultNot = ~firstNot;

        System.out.println("Result is: "+ resultNot);

    }
}
