package algorithm.week4.java1013.line;

import algorithm.week4.java1013.line.domain.Hospital;
import algorithm.week4.java1013.line.parser.HospitalParser;

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
        strings.add("INSERT INTO `hospital`.`seoul_hospital`\n" +
                "(`id`,\n" +
                "`address`,\n" +
                "`district`,\n" +
                "`category`,\n" +
                "`emergency_room`,\n" +
                "`name`,\n" +
                "`subdivision`)\n" +
                "VALUES");
        for (Hospital hospital : hospitals) {
            strings.add(hospital.getSqlInsertquery3());
        }

        strings.add("마지막에 ,지우고 ; 추가");
        writer.write(strings, "hospital_data.sql");
    }
}
