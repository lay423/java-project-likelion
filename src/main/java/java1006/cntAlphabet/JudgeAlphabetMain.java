package java1006.cntAlphabet;

import java.util.HashMap;

public class JudgeAlphabetMain {
    public static void main(String[] args) {
        JudgeAlphabet ja = new JudgeAlphabet();

        String s1 = "aaabbbcccddefghijkkklSlm".toUpperCase();

        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for (int i = 65; i < 91; i++) {
            alphabetMap.put((char) i, 0);
        }
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean isAlphabet = ja.isAlphabet(c);
            if (isAlphabet) {
                alphabetMap.put(c, alphabetMap.get(c)+1);
            }
        }
        for (int i = 65; i < 91; i++) {
            System.out.println((char)i + " " +alphabetMap.get((char) i));
        }
        System.out.println(s1);
    }
}
