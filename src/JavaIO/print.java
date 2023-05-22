package JavaIO;

import static java.lang.System.*;

public class print {
    public static void main(String[] args) {
        // print : sameline
        out.print("Hi ");
        out.print("Hi ");
        out.print("Hi ");
        //println : enter to new line
        out.println("\nHello");
        out.println("Hello");
        out.println("Hello");
        //printf format output java
        // Integer
        int x = 100;
        out.printf("Printing simple" + " integer: x = %d\n", x);
        // 2 decimals
        System.out.printf("Formatted with" + " precision: PI = %.2f\n", Math.PI);
        // automatically appends zero
        // to the rightmost part of decimal
        float n = 5.2f;

    }
}
