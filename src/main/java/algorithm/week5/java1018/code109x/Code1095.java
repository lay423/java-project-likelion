package algorithm.week5.java1018.code109x;

import java.util.Scanner;

public class Code1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int min =23;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println(min);

    }
}
