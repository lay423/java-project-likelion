package com.line.parser;

import com.line.domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalParserTest {

    String line1 = "\"A1120837\",\"서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)\",\"C\",\"의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"외과: 상시진료 내과는 당분간 휴진\",\"서울수 출 신경치료\",\"방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물\",\"가산기대찬의원\",\"02-6267-2580\",\"02-920-5374\",\"1930\",\"1930\",\"1930\",\"1930\",\"1930\",\"1500\",\"1500\",\"1500\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"1000\",\"1000\",\"085\",\"11\",\"126.88412249700781\",\"37.4803938036867\",\"2022-04-07 14:55:00.0\"";
    String line2 = "\"A1117873\",\"서울특별시 관악구 신원로 38 5층 (신림동 청암빌딩)\",\"N\",\"의원\",\"G099\",\"응급의료기관 이외\",2,\"외과: 상시진료 내과는 당분간 휴진\",\"서울시 목 인레이) 신경치료\",\"방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물\",\"가로수치과의원\",\"치과\"";

    private void assertCategories(Hospital hospital, String id, String address, int emergency_room, String category, String name){

        //id 테스트
        assertEquals(id, hospital.getId());

        //주소
        assertEquals(address, hospital.getAddress());

        //Emergency_room
        assertEquals(emergency_room, hospital.getEmergency_room());

        //Category
        assertEquals(category, hospital.getCategory());

        //Name
        assertEquals(name, hospital.getName());
    }
    @Test
    @DisplayName("id, 주소를 잘 파싱하는지 테스트")
    void name(){
        HospitalParser hospitalParser = new HospitalParser();

        assertCategories(hospitalParser.parse(this.line1),
        "A1120837",
        "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)",
        2,
        "C",
        "가산기대찬의원");

    }

    @Test
    @DisplayName("insert쿼리를 잘 만드는지 test")
    void makeSqlQueryTest(){
        HospitalParser hospitalParser = new HospitalParser();
        Hospital hospital = hospitalParser.parse(this.line1);
        String sql = "INSERT INTO `hospital`.`seoul_hospital`\n" +
                "(`id`,\n" +
                "`address`,\n" +
                "`district`,\n" +
                "`category`,\n" +
                "`emergency_room`,\n" +
                "`name`,\n" +
                "`subdivision`)\n" +
                "VALUES('A1120837',\n" +
                "('서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)',\n" +
                "('서울특별시 금천구',\n" +
                "('C',\n" +
                "('2',\n" +
                "('가산기대찬의원',\n" +
                "(null);\n";
        assertEquals(sql, hospital.getSqlInsertquery2());

    }

}