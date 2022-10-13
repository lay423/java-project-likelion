package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {

    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        String subdivision;

        for (int i = 0; i < splitted.length; i++) {
            splitted[i] = splitted[i].replace('\'', '\\');
            splitted[i] = splitted[i].replace("\"", "");
        }
        //splitted[6] = String.valueOf(splitted[6].charAt(1));


        String[] districtArr = splitted[1].split(" ");
        String district = districtArr[0] + " " + districtArr[1];

        if (splitted[10].contains("내과")) {
            subdivision = "내과";
        } else if (splitted[10].contains("치과")) {
            subdivision = "치과";
        } else if (splitted[10].contains("피부과")) {
            subdivision = "피부과";
        } else if (splitted[10].contains("성형외과")){
            subdivision = "성형외과";
        }else if (splitted[10].contains("외과")) {
            subdivision = "외과";
        }else if (splitted[10].contains("가정의학과")) {
            subdivision = "가정의학과";
        }else if(splitted[10].contains("소아과")){
            subdivision = "소아과";
        }else if (splitted[10].contains("한의원")) {
            subdivision = "한의원";
        }else {
            subdivision = null;
        }


        return new Hospital(splitted[0], splitted[1], district,
                splitted[2], Integer.parseInt(splitted[6]), splitted[10], subdivision);
    }
}
