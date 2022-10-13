package java1006.rndAlphabet;

public class RandomAlphabetNumberCreator implements NumberCreator{
    @Override
    public int create(int num) {
        //1이 들어오면 알파벳 대문자를 생성합니다.
        if(num == 1)
            return (int)(Math.random()*26)+65;
        //그 외엔 알파벳 소문자를 생성합니다.
        else
            return (int)(Math.random()*26)+97;
    }
}
