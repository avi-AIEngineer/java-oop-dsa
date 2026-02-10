package ds;

import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void pushThenPeek_returnsLastPushed() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    void popOnEmpty_throwsEmptyStackException() {
        MyStack<String> stack = new MyStack<>();
        assertThrows(EmptyStackException.class, () -> stack.pop());
        assertTrue(stack.isEmpty());
    }
}