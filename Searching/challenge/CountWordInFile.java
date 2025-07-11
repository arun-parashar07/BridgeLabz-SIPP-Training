package search.filereader;

import java.io.*;

public class CountWordInFile {
    public int countWord(String filename, String word) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String w : line.split("\s+")) {
                    if (w.equals(word)) count++;
                }
            }
        }
        return count;
    }
}
