package algorithm.week8.java1107;

import java.util.Arrays;

public class Harshad {

    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int divNum=10000;
        int[] digitNums = new int[]{0,0,0,0,0};
        int cnt=0;

        for (int i = 0; i < digitNums.length; i++) {
            if (num / divNum != 0) {
                digitNums[i]=num/divNum;
                cnt += digitNums[i];
            }
            num%=divNum;
            divNum/=10;
        }
        if (x % cnt == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
