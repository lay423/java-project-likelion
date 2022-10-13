package java1007.population;

import java.util.HashMap;
import java.util.Map;

public class PopulationMove {
    private long id;
    private int fromSido;
    private int toSido;

    private String fromSidoKorean;
    private String toSidoKorean;
    static Map<Integer, String> sidoMap = new HashMap<>();
    //constructor 추가 fromSido, toSIdo를 받아서 멤버변수에 넣는 기능

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
        this.fromSidoKorean = sidoMap.get(fromSido);
        this.fromSidoKorean = sidoMap.get(toSido);
    }

    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
        this.fromSidoKorean = sidoMap.get(this.fromSido);
        this.fromSidoKorean = sidoMap.get(this.toSido);
    }

    public String getFromSidoKorean() {
        return fromSidoKorean;
    }

    public String getToSidoKorean() {
        return toSidoKorean;
    }

    public static void setSidoMap(){
        sidoMap.put(11,	"서울특별시");
        sidoMap.put(21,	"부산광역시");
        sidoMap.put(22,	"대구광역시");
        sidoMap.put(23,	"인천광역시");
        sidoMap.put(24,	"광주광역시");
        sidoMap.put(25,	"대전광역시");
        sidoMap.put(26,	"울산광역시");
        sidoMap.put(29,	"세종특별자치시");
        sidoMap.put(31,	"경기도");
        sidoMap.put(32,	"강원도");
        sidoMap.put(33,	"충청북도");
        sidoMap.put(34,	"충청남도");
        sidoMap.put(35,	"전라북도");
        sidoMap.put(36,	"전라남도");
        sidoMap.put(37,	"경상북도");
        sidoMap.put(38,	"경상남도");
        sidoMap.put(39,	"제주특별자치도");

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}
