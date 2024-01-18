import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge_05 {
    public static void main(String[] args) {

        // Take 2 numbers and show results of +, -, /, &, and %.
        System.out.println("-*-*-*-Arithmetic Operators-*-*-*-\n");
        Scanner  input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Division is: " + div);
        System.out.println("Modulus is: " + mod);
        System.out.println("\n");

        // Product of two decimal numbers.
        System.out.println("-*-*-*-Product of float-*-*-*-\n");
        System.out.print("Enter 1st decimal number: ");
        double firstDecimalNumber =  input.nextDouble();
        System.out.print("Enter 2nd decimal number: ");
        double secDecimalNumber =  input.nextDouble();

        double product = firstDecimalNumber * secDecimalNumber;
        System.out.println("The product is: " + product);
        System.out.println("\n");

        // Area of a rectangle
        System.out.println("-*-*-*-Area of Rectangle-*-*-*-\n");

        int sideA = 2;
        int sideB = 4;
        int sideC = 2;
        int sideD = 4;
        int p = sideA + sideB + sideC +sideD;
        System.out.println("The perimeter of rectangle is: " + p);

        // Area of a triangle
        int B = 2;
        int H = 4;
        int AT = (B*H)/2;
        System.out.println("The area of Triangle is: " + AT);

        // Simple Interest (PxTxR)/100

        // Compound Interest P(1 + R/100)t

        // Convert fahrenheit to celsius C = (F -32) x 5/9
        int F = 92;
        int C = (F - 32) * 5/9;
        System.out.println("92 F = " + C);

    }
}
