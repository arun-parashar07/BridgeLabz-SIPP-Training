import java.io.*;
public class Q5_ByteArrayStream {
    public static void main(String[] args) throws IOException {
        File file = new File("image.jpg");
        byte[] bytes = new byte[(int) file.length()];
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(bytes);
        }
        try (FileOutputStream fos = new FileOutputStream("copy.jpg")) {
            fos.write(bytes);
        }
    }
}