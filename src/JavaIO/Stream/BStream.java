package JavaIO.Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BStream {
    public static void main(String[] args) throws IOException {
        FileInputStream source = null;
        FileOutputStream target = null;
        try {
            source = new FileInputStream("/Users/nisarat/IdeaProjects/Final_Review/src/JavaIO/Stream/source.txt");
            target = new FileOutputStream("target.txt");
            // Reading source file and writing
            // content to target file byte by byte
            int temp ;
            while ((temp = source.read())!= -1){
                target.write((byte)temp);

            }

        } catch (IOException e) {
            Logger.getLogger(BStream.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (source!=null && target != null){
                source.close();
                target.close();
            }
        }

    }
}
