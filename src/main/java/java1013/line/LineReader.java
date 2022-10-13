package java1013.line;

import java1013.line.parser.Parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {
    Parser<T> parser;
    boolean isRemoveColumnHeader = true;
    List<T> readLines(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br
                = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "euc-kr"));
        String str;
        if (isRemoveColumnHeader) {
            br.readLine();
        }
        while((str = br.readLine()) != null){
            result.add(parser.parse(str));
        }
        br.close();
        return result;
    }


    public LineReader(Parser<T> parser) {
        this.parser = parser;
    }
}
