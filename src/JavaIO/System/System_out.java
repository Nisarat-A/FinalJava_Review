package JavaIO.System;

import static java.lang.System.*;

public class System_out {
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
        out.printf(
                "Formatted to "
                        + "specific width: n = %.4f\n",
                n);
        n = 2324435.3f;

        // here number is formatted from
        // right margin and occupies a
        // width of 20 characters
        System.out.printf(
                "Formatted to "
                        + "right margin: n = %20.4f\n",
                n);
    }

}
