package java1004;

import java.util.Scanner;

public class CurrencyCnt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] amount = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        System.out.print("금액을 넣으세요:");
        int money = sc.nextInt();
        int tmp;
        for(int i=0; i<amount.length; i++){
            System.out.println(amount[i]+"원"+money/amount[i]+"개");
            money = money % amount[i];
            System.out.println("남은금액: " + money);
        }

    }
}
