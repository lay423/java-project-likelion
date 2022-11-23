package algorithm.week10.java1123;

public class PrintStar {
    public static void print(int n) {
        if(n==0)
            return;
        System.out.print("*");
        print(n - 1);
    }

    public static void main(String[] args) {
        print(3);
    }
}
