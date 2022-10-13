package java1004;

import java.util.Scanner;

public class CurrencyCnt2 {

    public static void main(String[] args) {
        int curr1 = 50000;
        int curr2 = 10000;
        int curr3 = 5000;
        int curr4 = 1000;
        int curr5 = 500;
        int curr6 = 100;
        int curr7 = 50;
        int curr8 = 10;

        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 넣으세요:");
        int money = sc.nextInt();
        System.out.println(curr1+"원"+money/curr1+"장"+" 남은금액: "+money%curr1);
        money = money % curr1;
        System.out.println(curr2+"원"+money/curr2+"장"+" 남은금액: "+money%curr2);
        money = money % curr2;
        System.out.println(curr3+"원"+money/curr3+"장"+" 남은금액: "+money%curr3);
        money = money % curr3;
        System.out.println(curr4+"원"+money/curr4+"장"+" 남은금액: "+money%curr4);
        money = money % curr4;
        System.out.println(curr5+"원"+money/curr5+"장"+" 남은금액: "+money%curr5);
        money = money % curr5;
        System.out.println(curr6+"원"+money/curr6+"장"+" 남은금액: "+money%curr6);
        money = money % curr6;
        System.out.println(curr7+"원"+money/curr7+"장"+" 남은금액: "+money%curr7);
        money = money % curr7;
        System.out.println(curr8+"원"+money/curr8+"장"+" 남은금액: "+money%curr8);
    }


}
