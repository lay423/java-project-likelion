package java1017.code108x;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Code1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr[0]; i++) {
            for (int j = 0; j < arr[1]; j++) {
                for (int k = 0; k < arr[2]; k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    sum++;
                }
            }
        }
        bw.flush();
        System.out.println(sum);

    }
}
