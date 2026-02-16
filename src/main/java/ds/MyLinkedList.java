package ds;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T value) {
        Node<T> node = new Node<>(value);
        node.next = head;
        head = node;

        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(T value) {
        Node<T> node = new Node<>(value);

        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public T removeFirst() {
        ensureNotEmpty();

        T value = head.data;
        head = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }
        return value;
    }

    public T removeLast() {
        ensureNotEmpty();

        if (size == 1) {
            T value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        // Walk to the node before tail
        Node<T> prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }

        T value = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    public T get(int index) {
        checkIndex(index);

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public boolean contains(T value) {
        Node<T> current = head;
        while (current != null) {
            if (Objects.equals(current.data, value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data);
            current = current.next;
            if (current != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    private void ensureNotEmpty() {
        if (size == 0) {
            throw new NoSuchElementException("List is empty");
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Index " + index + " out of bounds for size " + size
            );
        }
    }
}
