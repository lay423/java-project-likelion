package java1004;

public class ArrayTest {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i+1;
        }
        for(int i=0; i<10;i++){
            System.out.println(array[i]);
        }
    }
}
