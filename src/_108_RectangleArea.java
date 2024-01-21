import java.util.Scanner;

public class _108_RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
    }
}
