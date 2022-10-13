package java1006.cntAlphabet;

import java.util.HashMap;

public class MapExercise {
    public static void main(String[] args) {
        CreateData data = new CreateData();
        HashMap<String, String> map = new HashMap<>();
        HashMap<Character, Integer> alphabet = new HashMap<>();

        String[] names = data.getNames();

        map = data.getMaps();

        for (int i = 97; i < 123; i++) {
            alphabet.put((char) i, 0);
        }

        for (int i = 0; i < map.size(); i++) {
            for(int j=65; j<91; j++){
                String[] result = map.get(names[i]).split(String.valueOf((char)j));
                alphabet.put((char)(j+32), alphabet.get((char)(j+32))+result.length);
            }
            for(int j=97; j<123; j++){
                String[] result = map.get(names[i]).split(String.valueOf((char)j));
                alphabet.put((char)j, alphabet.get((char)j)+result.length);
            }
        }

        for (int i = 97; i < 123; i++) {
            System.out.println((char)i + " " +alphabet.get((char) i));
        }
    }
}
