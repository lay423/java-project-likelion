package java1012.line.parser;

import java1012.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {

    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");

        for (int i = 0; i < splitted.length; i++) {
            splitted[i] = splitted[i].replace('\'', '\\');
            splitted[i] = splitted[i].replace('\"', '\'');
        }
        splitted[6] = String.valueOf(splitted[6].charAt(1));


        String[] districtArr = splitted[1].split(" ");
        String district = districtArr[0] + " " + districtArr[1]+"\'";


        return new Hospital(splitted[0], splitted[1], district,
                splitted[2], Integer.parseInt(splitted[6]), splitted[10], null);
    }
}
