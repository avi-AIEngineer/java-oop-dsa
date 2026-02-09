package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue<T> {
    private final List<T> items = new ArrayList<>();
    private int head = 0;

    public void enqueue(T value) {
        items.add(value);
    }

    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        T value = items.get(head);
        head++;

        // simple cleanup to prevent unlimited growth
        if (head > 50 && head * 2 > items.size()) {
            items.subList(0, head).clear();
            head = 0;
        }
        return value;
    }

    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return items.get(head);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return items.size() - head;
    }
}