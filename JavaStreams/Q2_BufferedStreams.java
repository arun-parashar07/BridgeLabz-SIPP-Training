import java.io.*;
public class Q2_BufferedStreams {
    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largeSource.dat"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("largeDest.dat"))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        long end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start));
    }
}