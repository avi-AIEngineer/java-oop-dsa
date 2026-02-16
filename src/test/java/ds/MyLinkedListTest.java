package ds;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void addFirst_and_removeFirst_shouldFollowStackLikeOrder() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        assertEquals(3, list.size());
        assertEquals(30, list.removeFirst());
        assertEquals(20, list.removeFirst());
        assertEquals(10, list.removeFirst());
        assertTrue(list.isEmpty());
    }

    @Test
    void addLast_get_contains_removeLast_shouldWork() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");

        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("c", list.get(2));
        assertTrue(list.contains("b"));
        assertFalse(list.contains("z"));

        assertEquals("c", list.removeLast());
        assertEquals(2, list.size());
        assertEquals("[a, b]", list.toString());
    }

    @Test
    void remove_onEmpty_shouldThrow() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        assertThrows(NoSuchElementException.class, list::removeFirst);
        assertThrows(NoSuchElementException.class, list::removeLast);
    }
}
