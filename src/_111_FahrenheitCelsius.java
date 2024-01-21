import java.util.Scanner;

public class _111_FahrenheitCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Convert fahrenheit to celsius C = (F -32) x 5/9
        System.out.print("-*-*-*-Fahrenheit to Celsius Converter-*-*-*-\n");
        System.out.print("Enter Temperature in Fahrenheit: ");

        double F = input.nextDouble();
        double C = (F - 32) * 5/9;
        System.out.println("F" + F + "= C "+ C);
    }
}
