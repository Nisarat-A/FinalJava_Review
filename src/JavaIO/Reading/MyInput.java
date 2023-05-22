package JavaIO.Reading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyInput {
    public static void main(String[] args) throws IOException {
        String text ;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr) ;
        text = bfr.readLine();
        System.out.println(text);
    }
}
