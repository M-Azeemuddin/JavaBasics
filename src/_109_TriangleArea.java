import java.util.Scanner;

public class _109_TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Area of a triangle

        System.out.print("-*-*-*-Area of Triangle-*-*-*-\n");
        System.out.print("Enter base of the triangle: ");
        int B = input.nextInt();
        System.out.println("Enter height of thr triangle: ");
        int H = input.nextInt();

        int AT = (B*H)/2;

        System.out.println("The area of Triangle is: " + AT);
        System.out.println("\n");
    }
}
