package algorithm.week6.java1026;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    class Node{
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }
    private int size = 10000;
    private List<Node>[] table = new ArrayList[size];

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    public void insert(String key, Integer value) {
        //List
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null) {
            this.table[hashIdx] = new ArrayList<>();
        }
        //Map, Object
        this.table[hashIdx].add(new Node(key, value));

    }

    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if(key.equals(node.getKey())){
                return node.value;
            }
        }
        return null;
    }
    public int hash(String str) {
        int ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            ascii += str.charAt(i);
        }
        return ascii % 1000;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.insert("Yoonseo", 1);
        ht.insert("Seoyoon", 2);

        int result = ht.get("Yoonseo");

        if (result == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }

        result = ht.get("Seoyoon");
        if (result == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }
    }
}
