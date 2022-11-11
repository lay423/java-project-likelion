package algorithm.week8.java1111;

import java.util.Arrays;

public class TreasureMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int divNum;

        for (int idx = 0; idx < answer.length; idx++) {
            divNum = 16;
            answer[idx] = "";
            while (divNum >= 1) {
                if(arr1[idx]/divNum>0 || arr2[idx]/divNum>0){
                    System.out.println(idx+" 나눠지네 1: "+arr1[idx]+" 2: "+arr2[idx]);
                    answer[idx] += "#";
                    arr1[idx]%=divNum;
                    arr2[idx]%=divNum;
                }else {
                    System.out.println(idx+" 안나눠짐 1: "+arr1[idx]+" 2: "+arr2[idx]);
                    answer[idx] += " ";
                }
                divNum/=2;
            }
            System.out.println();
        }
        return answer;
    }

    public static void main(String[] args) {
        TreasureMap tm = new TreasureMap();
//        int n = 5;
//        int[] arr1 = new int[]{9, 20, 28, 18, 11};
//        int[] arr2 = new int[]{30, 1, 21, 17, 28};

        int n = 6;
        int[] arr1 = new int[]{46, 33, 33, 22, 31, 50};
        int[] arr2 = new int[]{27, 56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(tm.solution(n, arr1, arr2)));


        //출력	["#####","# # #", "### #", "# ##", "#####"]
        //	["######", "### #", "## ##", " #### ", " #####", "### # "]
    }
}
