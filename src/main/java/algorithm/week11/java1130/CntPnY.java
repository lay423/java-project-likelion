package algorithm.week11.java1130;

import java.util.Arrays;

public class CntPnY {

    //통과 못함
    public static boolean solution(String s) {
        String[] arr = s.split("p");
        String[] arr1 = s.split("P");
        String[] arr2 = s.split("y");
        String[] arr3 = s.split("Y");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int pCnt = arr.length+arr1.length-2;
        int yCnt = arr2.length+arr3.length-2;
        if(pCnt != yCnt)
            return false;
        else
            return true;
    }

    public static boolean solution2(String s) {
        int cntP=0;
        int cntY=0;
        for (int i = 0; i < s.length(); i++) {
            if('p'==s.charAt(i)||'P'==s.charAt(i)) cntP++;
            else if ('y' == s.charAt(i) || 'Y' == s.charAt(i)) cntY++;
        }
        if(cntP != cntY)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        System.out.println(solution2("pPoooyY"));
    }
}
