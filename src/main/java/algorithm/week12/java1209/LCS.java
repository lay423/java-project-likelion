package algorithm.week12.java1209;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";
        int[][] arr = new int[str2.length()+1][str1.length()+1];
        //Arrays.fill(arr, 0);

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                int k = i+1;
                int l = j+1;
                System.out.printf("%s %s\n", str2.charAt(i), str1.charAt(j));
                if(str2.charAt(i) == str1.charAt(j))
                    arr[k][l] = arr[k - 1][l - 1] + 1;
                else{
                    if (arr[k][l - 1] > arr[k - 1][l]) {
                        arr[k][l] = arr[k][l - 1];
                    }else
                        arr[k][l] = arr[k-1][l];
                }
            }
        }
        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                System.out.printf("%d ", arr[i][j]);

            }
            System.out.println();
        }
    }
}
