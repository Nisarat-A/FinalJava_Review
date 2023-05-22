package JavaIO.Write;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        File f = null;
        String str = null;
        FileWriter fw = null;
        BufferedReader bf = null;
        try {
            f = new File("/Users/nisarat/IdeaProjects/Final_Review/target.txt");
            str = "Write this string to my file";
            fw = new FileWriter(f);
            fw.write(str);


            bf = new BufferedReader(new FileReader("/Users/nisarat/IdeaProjects/Final_Review/target.txt"));
            String s;
            while ((s = bf.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            Logger.getLogger(FileWriter.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (fw != null) {
                fw.close();
            }
            if (bf != null) {
                bf.close();
            }
        }

    }
}
