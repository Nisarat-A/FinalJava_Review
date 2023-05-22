package JavaIO.Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SStream {
    public static void main(String[] args) throws IOException {
        FileReader source = null;
        try {
            source = new FileReader("/Users/nisarat/IdeaProjects/Final_Review/src/test.txt");
            int temp;
            while ((temp = source.read()) != -1) {
                System.out.println((char) temp);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(SStream.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (source != null)
                source.close();
        }
    }
}
