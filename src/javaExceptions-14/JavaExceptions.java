package javaexceptions;

public class JavaExceptions {

    public static void main(String[] args) {
        // TODO code application logic here

        int a = 20;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("My result: " + result);
        } catch (Exception e) {

            System.err.println("Error is: " + e.getMessage());
        }

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

}
