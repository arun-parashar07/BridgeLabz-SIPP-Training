import java.io.*;
public class Q3_ReadUserInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String age = br.readLine();
        String lang = br.readLine();
        try (FileWriter fw = new FileWriter("user.txt")) {
            fw.write(name + " " + age + " " + lang);
        }
    }
}