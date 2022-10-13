package java1006.codeUp3108;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class students{
    private char code;
    private int num;
    private String name;

    public students(char code, int num, String name) {
        this.code = code;
        this.num = num;
        this.name = name;
    }
}
public class ListInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<students> studentObj = new ArrayList<>();
        int[] correctData = new int[5];
        char code;
        int num;
        String name;

        for (int i = 0; i < n; i++) {
            code = sc.next().charAt(0);
            num = sc.nextInt();
            name = sc.nextLine();
            studentObj.add(new students(code, num, name));
        }
        for (int i = 0; i < correctData.length; i++) {
            correctData[i] = sc.nextInt();
        }
        for (int i = 0; i < correctData.length; i++) {
            System.out.println(studentObj.get(correctData[i]));
        }
    }
}
