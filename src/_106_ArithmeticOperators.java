import java.util.Scanner;

public class _106_ArithmeticOperators {
    public static void main(String[] args) {
        // Take 2 numbers and show results of +, -, /, &, and %.
        System.out.println("-*-*-*-Arithmetic Operators-*-*-*-\n");
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
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

    }
}
