import java.util.Scanner;

public class Challenge_08 {
    public static void main(String[] args) {
        System.out.println("***** Grade Calculator *****");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your percentage: ");
     float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println(percentage + "% Congratulation! you earned 'A' grade");
        } else if (percentage >= 75 ) {
            System.out.println(percentage + "% You earned 'B' grade");
        }else if (percentage >= 60 ) {
            System.out.println(percentage + "% You earned 'C' grade");
        }else if (percentage >= 30) {
            System.out.println(percentage + "% You earned 'D' grade");
        }else {
            System.out.println(percentage + "% You are Failed 'F' grade");
        }
    }
}
