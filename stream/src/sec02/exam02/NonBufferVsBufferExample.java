package sec02.exam02;

import java.io.*;

public class NonBufferVsBufferExample {
    public static void main(String[] args) throws Exception{
        String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
        System.out.println("originalFilePath1 = " + originalFilePath1);
        String targetFilaPath1 = "/Users/minwoo/workspace/codes/java/stream/out/production/stream/targetFile1.jpg";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilaPath1);

        String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
        System.out.println("originalFilePath2 = " + originalFilePath2);
        String targetFilaPath2 = "/Users/minwoo/workspace/codes/java/stream/out/production/stream/targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilaPath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼를 사용하지 않았을 때 : \t" + nonBufferTime + "ns");

        long BufferTime = copy(fis, fos);
        System.out.println("버퍼를 사용했을 때 : \t" + BufferTime + "ns");

        fis.close();
        fos.close();
        bos.close();
    }

    static int data = -1;
    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();
        while (true) {
            data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return (end - start);
    }
}
