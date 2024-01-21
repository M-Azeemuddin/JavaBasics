import java.util.Scanner;

public class Challenge_08 {
    public static void main(String[] args) {
        System.out.println("***** Grade Calculator *****");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Total marks: ");
        int tmarks = input.nextInt();
        System.out.print("Marks Obtained: ");
        int marks = input.nextInt();

         int percentage = (marks * tmarks) / 100;
        if (percentage >= 90) {
            System.out.println(percentage + "% Congratulation! you earned 'A' grade");
        } else if (percentage <= 80 ); {
            System.out.println(percentage + "% You earned 'B' grade");
        }
    }
}
