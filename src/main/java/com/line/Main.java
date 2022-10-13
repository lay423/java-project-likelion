package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader
                = new LineReader<>(new HospitalParser());
        String filename = "C:\\Users\\A\\springedu\\Hospital_ifo.csv";


        List<String> strings = new ArrayList<>();
        List<String> strings1 = new ArrayList<>();
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
//        for (Hospital hospital : hospitals) {
//            strings.add(writer.fromTOString(hospital));
//        }

        strings.add("마지막에 ,지우고 ; 추가");
        FileWriter writer = new FileWriter();
        for (Hospital hospital : hospitals) {
            strings1.add(hospital.getSqlInsertquery());
        }
        writer.write(strings1, "hospital_data.sql");
    }
}
