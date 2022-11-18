package algorithm.week9.java1118;

import org.junit.jupiter.api.Assertions;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == ' ')) {
                sb.append(s.charAt(i));                        //띄어쓰기는 그대로
            } else if ((s.charAt(i)) < 97 && (s.charAt(i) + n) > 90 || (s.charAt(i)) > 90 && (s.charAt(i) + n) > 122) {
                //Z 이상으로 넘어갈때
                sb.append((char) (s.charAt(i) + n - 26));
            } else
                sb.append((char) (s.charAt(i) + n));             //그 외 경우
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        String s1 = "AB";
        String s2 = "z";
        String s3 = "a B z";
        Assertions.assertEquals(cc.solution(s1, 1), "BC");
        Assertions.assertEquals(cc.solution(s2, 1), "a");
        Assertions.assertEquals(cc.solution(s3, 4), "e F d");


    }
}
