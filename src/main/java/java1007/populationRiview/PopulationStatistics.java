package java1007.populationRiview;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {

    public List<PopulationMoveReview> getListByData(String filename){
        List<PopulationMoveReview> pml = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                pml.add(parse(line));
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return pml;
    }

    public PopulationMoveReview parse(String data) {
        String[] s = data.split(",");
        return new PopulationMoveReview(s[0], s[1]);
    }

    public void createAFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
    }
    public String fromTOString(PopulationMoveReview populationMoveReview) {
        return populationMoveReview.getFromSido() + "," + populationMoveReview.getToSido()+"\n";
    }

    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String data = "2021_인구관련연간자료_20221006_11746.csv";
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMoveReview> pml = ps.getListByData(data);
        List<String> strings = new ArrayList<>();
        for (PopulationMoveReview pm : pml) {
            //파일저장
            String fromTO = ps.fromTOString(pm);
            strings.add(fromTO);
            System.out.printf("전입:%s | 전출:%s\n", pm.getFromSido(), pm.getToSido());
        }
        ps.write(strings, "from_to1.txt");

    }
}
