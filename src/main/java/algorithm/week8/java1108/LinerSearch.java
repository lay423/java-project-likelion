package algorithm.week8.java1108;

import java.util.Scanner;

public class LinerSearch {

    public int solution(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LinerSearch ls = new LinerSearch();
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(ls.solution(arr, target));

    }
}
