package sec02.exam05;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("/Users/minwoo/workspace/codes/java/stream/printstream.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println("[프린터 보조 스트림]");
        ps.print("마치 ");
        ps.print("프린터가 출력하는 것처럼");
        ps.print("데이터가 출력됩니다.");

        ps.flush();
        ps.close();
    }
}
