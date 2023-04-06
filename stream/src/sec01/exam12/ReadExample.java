package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) throws Exception{
        Reader reader = new FileReader("/Users/minwoo/workspace/codes/java/stream/test08.db");

        char[] buffer = new char[100];

        while (true) {
            int readCharNum = reader.read(buffer);
            if(readCharNum == -1) break;
            for (int i = 0; i < readCharNum; i++) {
                System.out.println(buffer[i]);
            }
        }
        reader.close();
    }
}
