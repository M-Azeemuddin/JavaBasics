import java.util.Scanner;

public class _05_arithmatic {
    public static void main(String[] args) {
        /*int a = 8;
        int b = 5;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        *//* Modulus operator "%"
         only works for int values
         and  return reminder of the division
         i.e. 8/5 = 1 Reminder 3*//*
        System.out.println(a%b);

        double x = 5;
        double y = 3;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
*/
        /*Order of Operations
        Bracket     ()  Parenthesise
        Order       -   Exponent
        Division    /   Division
        Multiply    *   Multiply
        Addition    +   Addition
        Subtraction _   Subtraction
        BODMAS          PEMDAS

        Direction left to right ---->
        9+3*3/2+4-2/7
         */

        /* Shorthand Operators
            += Addition assignment x += 4 equivalent x = x+4
            -= Subtraction assignment x -= 4 equivalent x = x-4
            *= Multiplication assignment x *= 4 equivalent x = x*4
            /= Division assignment x /= 4 equivalent x = x/4
            %= Reminder assignment x %= 4 equivalent x = x%4
         */

        /*int z = 5;
        Scanner input = new Scanner(System.in);
        int z1 = input.nextInt();
        z = z +z1;
        System.out.println(z);
        int z2 = input.nextInt();
        z = z +z2;
        System.out.println(z);
        int z3 = input.nextInt();
        z = z +z3;
        System.out.println(z);
        int z4 = input.nextInt();
        z = z +z4;
        System.out.println(z);*/

        /*Unary Operators
         - Converts a positive value to negative
         */
            int p = 5;
            int q = -p;
            int r = -q;
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

        int a = 5;
        a = a + 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        int b = 6;
        System.out.println(b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(++b);
        System.out.println(b);

        int c = 10;
        System.out.println(--c);
        System.out.println(c);

        System.out.println(c--);
        System.out.println(c);

    }
}
