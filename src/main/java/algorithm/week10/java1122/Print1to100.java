package algorithm.week10.java1122;




public class Print1to100 {
    public static void print1To100 (int n){
        if(n>100)
            return;

        System.out.println(n);
        print1To100(n+1);
    }

    public static void main(String[] args) {
        print1To100(1);

    }
}
