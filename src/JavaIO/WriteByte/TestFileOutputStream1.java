package JavaIO.WriteByte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("temp");
        byte[] bytes = new byte[]{1,2,3,4,5};
        out.write(bytes);
        out.flush();
        out.close();

    }
}
