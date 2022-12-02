package algorithm.week11.java1202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeFact {
    public static int[] factorization(int n){
        List<Integer> fact = new ArrayList<>();
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    fact.add(i);
                    n = n/i;
                    break;
                }
            }
        }
        int[] arr = new int[fact.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fact.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = factorization(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
