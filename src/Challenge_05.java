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
        System.out.print("Enter rectangle Side A: ");
        int sideA =  input.nextInt();
        System.out.print("Enter rectangle Side B: ");
        int sideB =  input.nextInt();
        System.out.print("Enter rectangle Side C: ");
        int sideC = input.nextInt();
        System.out.print("Enter rectangle Side D: ");
        int sideD = input.nextInt();

        int perimeter = sideA + sideB + sideC +sideD;
        System.out.println("The perimeter of rectangle is: " + perimeter);

        // Area of a triangle

        System.out.print("-*-*-*-Area of Triangle-*-*-*-\n");
        System.out.print("Enter base of the triangle: ");
        int B = input.nextInt();
        System.out.println("Enter height of thr triangle: ");
        int H = input.nextInt();

        int AT = (B*H)/2;
        System.out.println("The area of Triangle is: " + AT);
        System.out.println("\n");
        // Simple Interest (PxTxR)/100
        System.out.print("-*-*-*-Simple & Compound Interest Calculator-*-*-*-\n");
        System.out.print("Principal Amount in Rs.: ");
        double principal = input.nextDouble();
        System.out.print("Terms in year: ");
        double terms = input.nextDouble();
        System.out.print("Interest rate: ");
        double rate = input.nextDouble();

        double simpleInterest = (principal*terms*rate)/100;
        System.out.println("Simple Interest is: " + simpleInterest);

        double compoundInterest = principal*(1+rate/100)*terms;
        System.out.println("Compound Interest is: " + compoundInterest);
        System.out.println("\n");

        // Convert fahrenheit to celsius C = (F -32) x 5/9
        System.out.print("-*-*-*-Fahrenheit to Celsius Converter-*-*-*-\n");
        System.out.print("Enter Fahrenheit: ");

        double F = input.nextDouble();
        double C = (F - 32) * 5/9;
        System.out.println("F" + F + "= C "+ C);

    }
}
