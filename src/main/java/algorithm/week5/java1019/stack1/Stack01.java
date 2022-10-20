package algorithm.week5.java1019.stack1;

public class Stack01 {

    private int[] arr = new int[10000];
    private int pointer = 0;

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public Stack01() {
    }

    public int pop(){
        this.pointer--;
        int value = this.arr[this.pointer];
        return value;
    }

    public int[] getArr(){
        return this.arr;
    }

    public void push(int value) {

        this.arr[this.pointer] = value;
        this.pointer++;
    }
}
