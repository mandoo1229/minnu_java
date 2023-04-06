package sec02.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExmaple {
    public static void main(String[] args) throws Exception{
        String path = ReadLineExmaple.class.getResource("language.txt").getPath();
        Reader reader = new FileReader(path);

        BufferedReader br = new BufferedReader(reader);

        while (true) {
            String data = br.readLine();
            if (data == null) break;
            System.out.println(data);
        }
        br.close();
    }
}
