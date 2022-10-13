package java1012.line;

import java1012.line.domain.Hospital;

import java.io.*;
import java.util.List;

public class FileWriter {

    public String fromTOString(Hospital hospital){
        return hospital.getId() + ","
                + hospital.getAddress() + ","
                + hospital.getDistrict() + ","
                + hospital.getCategory() + ","
                + hospital.getEmergency_room() + ","
                + hospital.getName() + ","
                + hospital.getSubdivision()
                + "),\n";
    }
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
