package algorithm.java1018.code109x;

import java.util.Scanner;

public class Code1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] callNum = new int[23];
        for (int i = 0; i < callNum.length; i++) {
            callNum[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            callNum[arr[i]-1]++;
        }
        for (int i = 0; i < callNum.length; i++) {
            System.out.println(callNum[i]);
        }
    }
}
