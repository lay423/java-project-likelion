package algorithm.java1020;

public class Stack02 {

    private Integer[] arr;
    private int pointer = 0;

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Stack02() {
        arr= new Integer[10000];
    }

    public int pop(){
        this.pointer--;
        int value = this.arr[this.pointer];
        return value;
    }

    public Integer[] getArr(){
        return this.arr;
    }

    public void push(int value) {

        this.arr[this.pointer] = value;
        this.pointer++;
    }
}