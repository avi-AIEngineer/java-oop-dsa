package ds;

import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    @Test
    void enqueueThenDequeue_returnsInFifoOrder() {
        MyQueue<Integer> q = new MyQueue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        assertEquals(1, q.dequeue());
        assertEquals(2, q.dequeue());
        assertEquals(1, q.size());
        assertEquals(3, q.peek());
    }

    @Test
    void dequeueOnEmpty_throws() {
        MyQueue<String> q = new MyQueue<>();
        assertThrows(NoSuchElementException.class, () -> q.dequeue());
        assertTrue(q.isEmpty());
    }
}