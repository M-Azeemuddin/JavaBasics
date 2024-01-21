import java.util.Scanner;

public class _114_GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Find greatest of three

        System.out.println("***** Greatest of Three ***** \n");
        System.out.print("Enter 1st number: ");
        int first = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int second = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println("1st number is greatest: " + first);
        } else if (second >= third) {
            System.out.println("2nd number is greatest: " + second);
        } else {
            System.out.println("3rd number is greatest: " + third);
        }
    }
}
