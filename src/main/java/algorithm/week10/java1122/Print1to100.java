package algorithm.week10.java1122;




public class Print1to100 {
    public static void print1To100 (int n){
        if(n>100)

        System.out.println(n);
        print1To100(n);
        n++;
    }

    public static void main(String[] args) {
        print1To100(1);

    }
}
