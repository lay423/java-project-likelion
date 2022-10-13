package java1012.line;

import java1012.line.domain.Hospital;
import java1012.line.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader
                = new LineReader<>(new HospitalParser());
        String filename = "C:\\Users\\A\\springedu\\Hospital_ifo.csv";
        FileWriter writer = new FileWriter();

        List<String> strings = new ArrayList<>();
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);
        strings.add("SELECT * FROM sns.user;INSERT INTO `hospital`.`seoul_hospital`\n" +
                "(`id`,\n" +
                "`address`,\n" +
                "`district`,\n" +
                "`category`,\n" +
                "`emergency_room`,\n" +
                "`name`,\n" +
                "`subdivision`)\n" +
                "VALUES");
        for (Hospital hospital : hospitals) {
            strings.add("("+writer.fromTOString(hospital));
        }
        strings.add(";");
        writer.write(strings, "hospital_data.sql");
    }
}
