package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("/Users/minwoo/workspace/codes/java/stream/test08.db");

        char[] array = {'A', 'B', 'C'};

        writer.write(array);

        writer.flush();
        writer.close();
    }
}
