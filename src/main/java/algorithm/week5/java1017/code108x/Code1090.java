package algorithm.week5.java1017.code108x;

import java.util.Scanner;

public class Code1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int plusNum = sc.nextInt();
        int idxNum = sc.nextInt();
        long result = startNum;
        for (int i = 1; i < idxNum; i++) {
            result *= plusNum;
        }
        System.out.println(result);
    }
}
