package algorithm.week12.java1209;

import java.util.Arrays;
import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int[][] arr = new int[str2.length() + 1][str1.length() + 1];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                int k = i + 1;
                int l = j + 1;
                if (str2.charAt(i) == str1.charAt(j))
                    arr[k][l] = arr[k - 1][l - 1] + 1;
                else {
                    if (arr[k][l - 1] > arr[k - 1][l]) {
                        arr[k][l] = arr[k][l - 1];
                    } else
                        arr[k][l] = arr[k - 1][l];
                }
            }
        }
        System.out.println(arr[str2.length()][str1.length()]);
    }
}
