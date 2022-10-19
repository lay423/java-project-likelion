package algorithm.java1017.code108x;

import java.io.IOException;
import java.util.Scanner;

public class Code1087 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i=1;
        while (sum < num) {
            sum +=i;
            i++;
        }
        System.out.println(sum);
    }
}
