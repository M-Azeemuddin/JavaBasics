import java.util.Scanner;

public class Challenge_03 {
    // Input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Good morning " + name);
        System.out.print("Please enter 1st number: ");
        int numOne = input.nextInt();
        System.out.print("Please enter 2nd number: ");
        int numTwo = input.nextInt();
        int ans = numOne + numTwo;
        System.out.println("Your Ans is: " + ans);
    }
}
