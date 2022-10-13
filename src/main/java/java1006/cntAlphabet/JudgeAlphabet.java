package java1006.cntAlphabet;

public class JudgeAlphabet {

    public boolean isAlphabet(char c) {
        if(c >= 65 && c<=90 || 97 <= c && c <= 122)
            return true;
        return false;
    }
}
