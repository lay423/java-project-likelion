package java1018.code109x;

import java.util.Scanner;

public class Code1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int multiNum = sc.nextInt();
        int plusNum = sc.nextInt();
        int idxNum = sc.nextInt();

        long result = startNum;
        for (int i = 1; i < idxNum; i++) {
            result *= multiNum;
            result += plusNum;
        }
        System.out.println(result);
    }
}
