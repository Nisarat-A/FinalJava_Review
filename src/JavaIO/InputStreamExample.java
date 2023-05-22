package JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null ;
        try{
            inputStream = new FileInputStream("text.txt");
            byte[] bytes = new byte[1024] ;
            int index;
            while((index = inputStream.read(bytes)) != -1)
            {System.out.println("index : " + index);}}
            finally{if (inputStream != null) { inputStream.close(); }}}
}
