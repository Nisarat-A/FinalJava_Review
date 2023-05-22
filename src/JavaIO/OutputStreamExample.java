package JavaIO;

import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("text.txt");
            outputStream = new FileOutputStream("text.txt");
            byte[] bytes = new byte[1024];
            int index;
            while ((index = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, index);
            }

        } finally {
            if(outputStream != null){
                outputStream.close();
            }

            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
