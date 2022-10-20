package algorithm.java1020;

import java.util.EmptyStackException;

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
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        this.pointer--;
        int value = this.arr[this.pointer];
        return value;
    }

    public boolean isEmpty(){
        boolean isEmpty = this.pointer == 0;
        return isEmpty;
    }

    public Integer[] getArr(){
        return this.arr;
    }

    public void push(int value) {

        this.arr[this.pointer] = value;
        this.pointer++;
    }

    public int peek(){
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[this.pointer-1];
    }
}
