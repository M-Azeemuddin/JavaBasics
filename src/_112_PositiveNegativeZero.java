import java.util.Scanner;

public class _112_PositiveNegativeZero {
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

    }
}
