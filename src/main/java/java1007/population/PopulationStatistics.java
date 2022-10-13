package java1007.population;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java1007.population.PopulationMove.sidoMap;

public class PopulationStatistics {

    public void readByChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

    //while문 안에서 String을 PopulationMove로 parsing하여 pml에 add합니다.
    //루프가 끝나면 return 합니다.
    public List<PopulationMove> readFileByLineV2(String filename) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(filename));
        String s = "";

        while ((s = br.readLine()) != null) {
            pml.add(parse(s));
        }
        br.close();
        return pml;
    }


    public PopulationMove parse(String data) {

        String[] arr = data.split(",");
        return new PopulationMove(arr[0], arr[1]);
    }



    //data에서 시도를 찾아 Map에 저장하는 메소드
    public void setMapsByLine(String filename, PopultaionMoveMap popultaionMoveMap) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            for (int i = 0; i < 10; i++) {
                line = br.readLine();
                popultaionMoveMap.save(parse(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createAFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
    }

    //List<String>을 지정한 파일에 write
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

    public String fromTOString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }

    public static void setSidoMap(){
        sidoMap.put(11,	"서울특별시");
        sidoMap.put(26,	"부산광역시");
        sidoMap.put(27,	"대구광역시");
        sidoMap.put(28,	"인천광역시");
        sidoMap.put(29,	"광주광역시");
        sidoMap.put(30,	"대전광역시");
        sidoMap.put(31,	"울산광역시");
        sidoMap.put(41,	"경기도");
        sidoMap.put(42,	"강원도");
        sidoMap.put(43,	"충청북도");
        sidoMap.put(44,	"충청남도");
        sidoMap.put(45,	"전라북도");
        sidoMap.put(46,	"전라남도");
        sidoMap.put(47,	"경상북도");
        sidoMap.put(48,	"경상남도");
        sidoMap.put(50,	"제주특별자치도");

    }

    public Map<Integer, Integer> setSidoMapV2(){
        Map<Integer, Integer> sidoMapV2 = new HashMap<>();
        sidoMapV2.put(11,	1);
        sidoMapV2.put(26,	2);
        sidoMapV2.put(27,	3);
        sidoMapV2.put(28,	4);
        sidoMapV2.put(29,	5);
        sidoMapV2.put(30,	6);
        sidoMapV2.put(31,	7);
        sidoMapV2.put(41,	8);
        sidoMapV2.put(42,	9);
        sidoMapV2.put(43,	10);
        sidoMapV2.put(44,	11);
        sidoMapV2.put(45,	12);
        sidoMapV2.put(46,	13);
        sidoMapV2.put(47,	14);
        sidoMapV2.put(48,	15);
        sidoMapV2.put(50,	16);
        return sidoMapV2;
    }
    public Map<String, Integer> getMoveCnt(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public Map<Integer, Integer> heatmapInxMap(){
        return null;
    }

    public static void main(String[] args) throws IOException {
        String address = "from_to.txt";
        PopulationStatistics ps = new PopulationStatistics();
        Map<Integer, Integer> sidoMapV2 = ps.setSidoMapV2();
    /*  Map형식으로 받기 테스트
        PopultaionMoveMap popultaionMoveMap = new PopultaionMoveMap();

        //data에서 시도를 찾아 Map에 저장하는 메소드
        populationStatistics.setMapsByLine(address, popultaionMoveMap);

        for (int i = 1; i < 10; i++) {
            System.out.println(popultaionMoveMap.findById(i));
        }
        //출력
        1 ,11 ,11
        2 ,11 ,11
        3 ,11 ,11
        4 ,11 ,11
        5 ,11 ,11
        6 ,11 ,11
        7 ,11 ,41
        8 ,11 ,44
        9 ,11 ,48
    */
    /*  List형식으로 받기 테스트
        List<PopulationMove> pml = populationStatistics.readFileByLineV2(address);
        System.out.println(pml.size());

        //출력결과
        6209323
    */
        //populationStatistics.createAFile("from_to.txt");
        setSidoMap();
        List<PopulationMove> pml = ps.readFileByLineV2(address);
//        List<String> strings = new ArrayList<>();
//        for (PopulationMove pm : pml) {
            //파일저장
//            String fromTO = populationStatistics.fromTOString(pm);
//            strings.add(fromTO);
//            System.out.printf("전입:%s | 전출:%s\n", pm.getFromSido(), pm.getToSido());
//        }
//        System.out.println(pml.size());

//        파일저장
//        populationStatistics.write(strings, "from_to.txt");

        //getMoveCnt 메소드 테스트
        Map<String, Integer> map = ps.getMoveCnt(pml);
        //System.out.println(map);

        String targetFilename = "each_sido_cnt.txt";
        ps.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String[] fromto = key.split(",");
            //매핑을 해서 저장
            String s = String.format("[%s, %s, %d],", sidoMapV2.get(Integer.parseInt(fromto[0])),
                    sidoMapV2.get(Integer.parseInt(fromto[1])), map.get(key));
//            String s = String.format("key:%s value:%d\n", key, map.get(key));2
            cntResult.add(s);
        }
        ps.write(cntResult, targetFilename);
    }

}
