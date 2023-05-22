package JavaIO.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BStream {
    public static void main(String[] args) {
        FileInputStream source = null;
        FileOutputStream target = null;
        try {
            source = new FileInputStream("source.txt");

        } catch (FileNotFoundException e) {
            Logger.getLogger(BStream.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
