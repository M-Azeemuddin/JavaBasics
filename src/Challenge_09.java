import java.util.Scanner;

public class Challenge_09 {
    public static void main(String[] args) {
        // Age Group Finder
        System.out.println("**** Find your Age Group ****\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        if (age >= 60) {
            System.out.println("You are in senior group");
        }else if (age >= 21) {
            System.out.println("You are in adult group");
        }else if (age >= 13) {
            System.out.println("you are in teen group");
        }else {
            System.out.println("You are a child");
        }
    }
}
