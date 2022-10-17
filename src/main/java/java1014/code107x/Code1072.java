package java1014.code107x;

import java.util.Scanner;

public class Code1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
