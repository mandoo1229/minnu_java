package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws Exception{
        OutputStream os = new FileOutputStream("/Users/minwoo/workspace/codes/java/stream/test2.db");

        byte[] array = {10, 20, 30};

        os.write(array);
        os.flush();
        os.close();

    }
}
