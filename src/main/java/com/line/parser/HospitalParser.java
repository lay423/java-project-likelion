package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {

    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        String subdivision = null;
        String[] subdivisionType = {"내과", "치과", "피부과", "성형외과", "외과", "가정의학과", "소아과", "한의원", };

        //따옴표 제거
        for (int i = 0; i < splitted.length; i++) {
            splitted[i] = splitted[i].replace('\'', '\\');
            splitted[i] = splitted[i].replace("\"", "");
        }

        //district 넣기
        String[] districtArr = splitted[1].split(" ");
        String district = districtArr[0] + " " + districtArr[1];

        //subdivision 넣기
        for (int i = 0; i < subdivisionType.length; i++) {
            if(splitted[10].contains(subdivisionType[i])){
                subdivision = subdivisionType[i];
            }
        }

        return new Hospital(splitted[0], splitted[1], district,
                splitted[2], Integer.parseInt(splitted[6]), splitted[10], subdivision);
    }
}
