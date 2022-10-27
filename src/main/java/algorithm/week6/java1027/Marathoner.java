package algorithm.week6.java1027;

import java.util.HashMap;
import java.util.Map;

public class Marathoner {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            if (memo.get(key) == null) {
                memo.put(key, 0);
            }
            memo.put(key, memo.get(key)+1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, memo.get(key)-1);
        }
        for(String key : memo.keySet()){
            if (memo.get(key)==1) {
                return key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Marathoner mt = new Marathoner();
        String[] arr = new String[]{"leo", "kiki", "eden"};
        String[] arr1 = new String[]{"kiki", "eden"};
        String[] arr2 = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] arr3 = new String[]{"stanko", "ana", "mislav"};

        System.out.println(mt.solution(arr, arr1));
        System.out.println(mt.solution(arr2, arr3));

    }
}
