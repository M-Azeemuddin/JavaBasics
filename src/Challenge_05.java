import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge_05 {
    public static void main(String[] args) {

        // Take 2 numbers and show results of +, -, /, &, and %.

        Scanner  input = new Scanner(System.in);
        System.out.println(" Arithmetic  Operations\n");
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


        int a = 10;
        int b = 2;
        int c = a + b;
        System.out.println("Result of a + b = " + c);
        int d = a - b;
        System.out.println("Result of a - b = " + d);
        int e = a * b;
        System.out.println("Result of a * b = " + e);
        int f = a / b;
        System.out.println("Result of a / b = " + f);
        int g = 13 / 4;
        System.out.println("Result of a % b = " + g);

        // Product of two decimal numbers.

        System.out.println("Enter 1st decimal number: ");
        double firstDecimalNumber =  input.nextDouble();
        double h = 4.2;
        double i = 5.0;
        double j = h * i;
        System.out.println("The product is: " + j);

        // Area of a rectangle
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
