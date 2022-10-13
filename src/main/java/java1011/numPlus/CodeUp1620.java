package java1011.numPlus;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result;
        do{
            result=0;
            while (num > 0) {
                result += num%10;
                num /=10;
            }
            num = result;
        }while (result >9);
        System.out.println(result);
    }
}
