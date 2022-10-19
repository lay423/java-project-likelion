package algorithm.java1013.line;

import java.io.*;
import java.util.List;

public class FileWriter {


    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer
                    = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
