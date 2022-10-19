package algorithm.java1019.stack1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {

    @Test
    void pushTest() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        int[] arr = stack01.getArr();

        Assertions.assertEquals(10, arr[0]);
        Assertions.assertEquals(20, arr[1]);

    }

    @Test
    @DisplayName("push가 잘 되는지 pop이 잘 되는지")
    void pushAndPop(){
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        Assertions.assertEquals(20, stack01.pop());
        Assertions.assertEquals(10, stack01.pop());

        stack01.push(30);
        Assertions.assertEquals(30, stack01.pop());
    }
}