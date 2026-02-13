package ds;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void enqueueDequeue_fifoOrder() {
        MyQueue<Integer> q = new MyQueue<>();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        assertEquals(3, q.size());
        assertEquals(10, q.dequeue());
        assertEquals(20, q.dequeue());
        assertEquals(30, q.dequeue());
        assertTrue(q.isEmpty());
    }

    @Test
    void dequeueOnEmpty_throws() {
        MyQueue<String> q = new MyQueue<>();
        assertThrows(NoSuchElementException.class, q::dequeue);
    }

    @Test
    void peek_doesNotRemove() {
        MyQueue<String> q = new MyQueue<>();
        q.enqueue("A");
        q.enqueue("B");

        assertEquals("A", q.peek());
        assertEquals(2, q.size());
        assertEquals("A", q.dequeue());
        assertEquals("B", q.dequeue());
    }
}
