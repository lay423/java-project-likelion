package algorithm.week11.java1128;

public class Alphabet {
    //97~122
    public static void printAtoZ(){
        for (int i = 65; i <= 90; i++) {
            System.out.println((char)i);
        }
    }
    public static void printAAtoZZ(){
        for (int i = 65; i <= 90; i++) {
            for (int j = 65; j <= 90; j++) {
                System.out.println(""+(char)i+(char)j);
            }
        }
    }
    public static void printAtoZ2(int n){
        if(n==91)
            return;
        System.out.println((char)n);
        printAtoZ2(n+1);
    }

    public static void printAAtoZZ2(int a, int b) {
        if(a==90&&b==91)
            return;
        else if (b == 91) {
            b=60;
            a++;
        }
        System.out.println(""+(char)a+(char)b);
        printAAtoZZ2(a,b+1);
    }

    public static void main(String[] args) {
        printAAtoZZ2(65,65);
    }
}
