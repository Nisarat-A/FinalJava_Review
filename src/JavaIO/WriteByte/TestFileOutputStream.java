package JavaIO.WriteByte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("temp.txt");
        file.write(1);file.write(2);file.write(3);file.write(4);
        file.write(5);file.write(6);file.write(7);file.write(8);
        file.close();
    }
}
