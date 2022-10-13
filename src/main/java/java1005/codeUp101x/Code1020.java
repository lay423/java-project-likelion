package java1005.codeUp101x;

import java.util.Scanner;

public class Code1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("\\-");
        System.out.println(arr[0]+arr[1]);
    }
}
