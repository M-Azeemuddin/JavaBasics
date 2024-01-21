import java.util.Scanner;

public class _105_SwapValues {
    // Swap Value
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping Station\n");
        System.out.print("Enter value for A: ");
        int a = input.nextInt();
        System.out.print("Enter value for B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Swapping done.....");
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
    }
}
