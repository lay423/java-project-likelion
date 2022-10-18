package java1017.code108x;

import java.io.IOException;
import java.util.Scanner;

public class Code1086 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        long sum=1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum *= arr[i];
        }

        double result = sum;
        result /= 1024.0 * 1024.0 * 8.0;
        System.out.printf("%.2f MB", result);


    }
}
