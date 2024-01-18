import java.util.Scanner;

public class _03_userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Good morning " + name);
        System.out.print(name + " Also tell us your age: ");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");
    }
}
