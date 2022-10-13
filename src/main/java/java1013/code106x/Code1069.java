package java1013.code106x;

import java.util.Scanner;

public class Code1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a == 'A') {
            System.out.println("best!!!");
        } else if (a == 'B') {
            System.out.println("good!!");
        } else if (a == 'C') {
            System.out.println("run!");
        } else if (a == 'D') {
            System.out.println("slowly~");
        }else {
            System.out.println("what?");
        }
    }
}
