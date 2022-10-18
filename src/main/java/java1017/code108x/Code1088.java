package java1017.code108x;

import java.util.Scanner;

public class Code1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        while (i <= num) {
            if (i % 3 != 0) {

                System.out.print(i +" ");

            }            i++;
        }
    }
}
