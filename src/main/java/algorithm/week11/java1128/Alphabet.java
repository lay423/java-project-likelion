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

    public static void main(String[] args) {
        printAtoZ();
        printAAtoZZ();
    }
}
