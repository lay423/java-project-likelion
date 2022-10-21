package algorithm.week5.java1021;

import java.util.Stack;

public class SolveBracket {

    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if('(' == s.charAt(i)){
                st.push(s.charAt(i));
            } else{
                if (st.empty()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }
    boolean solution1(String s) {
        boolean answer = true;
        int a = 0, b = 0;
        int checkBracketOpen = 0;
        int isBracketOpen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                checkBracketOpen++;
                a++;
            } else {
                checkBracketOpen--;
                b++;
            }
            if (checkBracketOpen < 0) {
                isBracketOpen = 1;
            }
        }
        if (isBracketOpen == 1) {
            answer = false;
        } else if (a == b) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public boolean solution2(String s) {
        while (s.indexOf("()") >= 0) {
            s = s.replace("()", "");
        }
        return s.length() ==0;
    }

    public static void main(String[] args) {
        SolveBracket solveBracket = new SolveBracket();
        String s = "()()";
        String s1 = "(())()";
        String s2 = ")()(";
        String s3 = "(()(";

        System.out.println(solveBracket.solution(s));
        System.out.println(solveBracket.solution(s1));
        System.out.println(solveBracket.solution(s2));
        System.out.println(solveBracket.solution(s3));

    }
}
