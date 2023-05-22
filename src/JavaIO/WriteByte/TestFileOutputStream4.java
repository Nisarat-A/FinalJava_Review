package JavaIO.WriteByte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFileOutputStream4 {
    public static void main(String[] args) throws IOException {

        FileOutputStream output = null;
        FileInputStream input = null;
        try {
            output = new FileOutputStream("noey.txt");
            String s = "Hello World!";
            byte[] b = s.getBytes();
            output.write(b);
            output.flush();
            output.close();

            input = new FileInputStream("noey.txt");
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();

        } catch (IOException e) {
            Logger.getLogger(TestFileOutputStream4.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            if (output != null && input != null) {
                output.close();
                input.close();
            }
        }

    }
}
