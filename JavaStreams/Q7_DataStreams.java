import java.io.*;
public class Q7_DataStreams {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"))) {
            dos.writeInt(1);
            dos.writeUTF("John");
            dos.writeDouble(3.5);
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
        }
    }
}