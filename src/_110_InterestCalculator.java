import java.util.Scanner;

public class _110_InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Simple  & Compound Interest (PxTxR)/100

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
    }
}
