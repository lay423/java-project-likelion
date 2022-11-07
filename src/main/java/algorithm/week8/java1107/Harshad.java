package algorithm.week8.java1107;

import java.util.Arrays;

public class Harshad {
    //자릿수 합 구하기
    //나누어떨어지는지
    public static void main(String[] args) {
        int num=13456;
        int divNum=10000;
        int[] digitNums = new int[]{0,0,0,0,0};

        for (int i = 0; i < digitNums.length; i++) {
            if (num / divNum != 0) {
                digitNums[i]=num/divNum;
            }
            num%=divNum;
            divNum/=10;
        }
        System.out.println(Arrays.toString(digitNums));
        int cnt=0;
        for (int digitNum : digitNums) {
            cnt+=digitNum;
        }
        System.out.println(cnt);
    }
}
