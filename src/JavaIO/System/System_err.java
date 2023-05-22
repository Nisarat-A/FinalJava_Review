package JavaIO.System;

import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;
public class System_err {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = null ;
        inp = new InputStreamReader(System.in);
        System.out.println("Enter characters, "
                + " and '0' to quit. ");
        char c ;
        do{
            c = (char)inp.read();
            out.println(c);
        }while (c!=0);
    }
}
