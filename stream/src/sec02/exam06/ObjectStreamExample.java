package sec02.exam06;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ObjectStreamExample {
    public static void main(String[] args) throws Exception {
        writeList();
        List<Board> list = readList();

        for (Board board:
                list) {
            System.out.println(board);
        }
    }
    public static void writeList() throws Exception {
        List<Board> list = new ArrayList();

        list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
        list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
        list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));

        FileOutputStream fos = new FileOutputStream("/Users/minwoo/workspace/codes/java/stream/board.db");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.flush();
        oos.close();
    }

    public static List<Board> readList() throws Exception {
        FileInputStream fis = new FileInputStream("/Users/minwoo/workspace/codes/java/stream/board.db");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board> list = (List<Board>) ois.readObject();
        return list;
    }
}
