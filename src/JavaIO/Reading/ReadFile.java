package JavaIO.Reading;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {
    public static void main(String[] args) {
        try
        {
            File fl = new File("/Users/nisarat/IdeaProjects/Final_Review/src/test.txt");
            BufferedReader br = new BufferedReader(new FileReader(fl)) ;
            String str;
            while ((str=br.readLine())!=null)
            {
                System.out.println(str);
            }
            br.close();
        }
        catch(IOException  e) {
            e.printStackTrace();
        }
        }
    }

