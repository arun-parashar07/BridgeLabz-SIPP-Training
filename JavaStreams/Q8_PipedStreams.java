import java.io.*;
public class Q8_PipedStreams {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream pos = new PipedOutputStream();
        final PipedInputStream pis = new PipedInputStream(pos);
        Thread writer = new Thread(() -> {
            try {
                pos.write("Hello".getBytes());
                pos.close();
            } catch (IOException e) {}
        });
        Thread reader = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {}
        });
        writer.start();
        reader.start();
    }
}