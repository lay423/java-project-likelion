package java1006.codeUp102x;

import java.util.Scanner;

public class Code1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.printf("\'%c\'", s.charAt(i));
            System.out.println();
        }
    }
}
