package java1006.fileRead;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFilePath {
    private String filePath;

    public ReadFilePath(String filePath) {
        this.filePath = filePath;
    }

    void fileList(){
        File dir = new File(filePath);
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }

    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char) fileReader.read();
    }
}
