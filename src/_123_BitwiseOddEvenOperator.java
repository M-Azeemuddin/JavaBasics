import java.util.Scanner;

public class _123_BitwiseOddEvenOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Odd/Even Finder Bitwise \n");

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is Even");
        }
    }
}
