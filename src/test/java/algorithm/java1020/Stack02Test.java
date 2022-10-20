package algorithm.java1020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @Test
    @DisplayName("push")
    void push() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

        assertThrows(EmptyStackException.class,()->{
           st.pop();
        });
    }
}