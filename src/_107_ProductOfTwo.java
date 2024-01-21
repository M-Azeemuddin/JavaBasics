import java.util.Scanner;

public class _107_ProductOfTwo {
    public static void main(String[] args) {
        // Product of two decimal numbers.
        Scanner input = new Scanner(System.in);
        System.out.println("-*-*-*-Product of float-*-*-*-\n");
        System.out.print("Enter 1st decimal number: ");
        double firstDecimalNumber =  input.nextDouble();
        System.out.print("Enter 2nd decimal number: ");
        double secDecimalNumber =  input.nextDouble();

        double product = firstDecimalNumber * secDecimalNumber;
        System.out.println("The product is: " + product);
        System.out.println("\n");
    }
}
