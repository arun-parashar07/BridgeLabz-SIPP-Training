package search.inputstreamreader;

import java.io.*;

public class ConsoleInputToFile {
    public void captureInput(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(filename)) {
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line + System.lineSeparator());
            }
        }
    }
}
