import java.util.Scanner;

public class _113_OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Odd Even check
        System.out.println("****** ODD or Even ******" );
        System.out.print("Enter a number:");
        int num2 = input.nextInt();

        if (num2 % 2 == 0) {
            System.out.println("Your number is even!");
        }else {
            System.out.println("Your number is odd!");
        }
    }
}
