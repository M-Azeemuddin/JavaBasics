public class _04_typeConversion {
    public static void main(String[] args) {

        // Automatic type conversion (Widening or implicit type conversion)
        float myFloat = 5;
        System.out.println(myFloat);
        // Narrowing - explicit conversion (Casting or Coercion)
        int myInt = (int) 6.0f;
        System.out.println(myInt);

        /*Implicit Example
        long big = 45;
        float dec = 3;
        double d = 3.4f;*/

        /* Explicit Examples
        float eDec = (float) 3.4;
        long eBig = (long) 3.4;
        int eInt = (int) 3.4;
         */
    }
}
