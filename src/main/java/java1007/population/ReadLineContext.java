package java1007.population;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {

    DoSomething<T> doSomething;

    public List<PopulationMove> readFileByLine(String filename) throws IOException {

        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(filename));
        String s = "";
        String s2;
        while ((s2 = br.readLine()) != null) {
            s += s2;
            System.out.println(s2);
        }
        br.close();
        System.out.println(s);
        return null;
    }
}
