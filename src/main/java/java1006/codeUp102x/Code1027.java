package java1006.codeUp102x;

import java.util.Scanner;

public class Code1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("[.]");
        System.out.printf("%s-%s-%s", arr[2], arr[1], arr[0]);

    }
}
