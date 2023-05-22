package JavaIO.WriteByte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("temp.txt");
        String s = "Welcome to Java"  ;
        byte b[] = s.getBytes() ;
        out.write(b);
        out.flush();
        out.close();
    }
}
