public class _06_if {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Tasneem";
        System.out.println("Before IF");
        if (isMale) {
            System.out.println("Hello Mr. " + name);
        } else {
            System.out.println("Hello Ms. "+ name);
        }
        System.out.println("After IF");

        // if else Ladder

        boolean isSeniorCitizen = true;
        boolean isAdult = true;

        if (isSeniorCitizen) {
            System.out.println("Hello senior citizen");
        } else if (isAdult) {
            System.out.println("Hello adult");
        } else {
            System.out.println("Hello child");
        }
    }
}
