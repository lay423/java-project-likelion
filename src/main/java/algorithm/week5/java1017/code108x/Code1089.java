package algorithm.week5.java1017.code108x;

import java.util.Scanner;

public class Code1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int plusNum = sc.nextInt();
        int idxNum = sc.nextInt();
        for (int i = 1; i < idxNum; i++) {
            startNum += plusNum;
        }
        System.out.println(startNum);
    }
}
