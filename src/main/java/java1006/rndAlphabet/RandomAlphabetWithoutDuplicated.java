package java1006.rndAlphabet;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RandomAlphabetNumberCreator ranc = new RandomAlphabetNumberCreator();
        Set<Integer> alphabet = new HashSet<>();
        for(int i=0; i<50; i++){
            int r = ranc.create(1);
            alphabet.add(r);
        }
        for (Integer integer : alphabet) {
            System.out.printf("%c ", integer);
        }
    /*case 1
        A B C D E F G H I J K L M N O Q R S T U V W X Y Z
     */
    }
}
