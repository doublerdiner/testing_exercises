package CodingTests.Three;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Queue<T> {
    private QueueNode<T> first;
    private QueueNode<T> last;

    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        QueueNode<T> newNode = new QueueNode<>(data);
        if (Objects.isNull(last)) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T data = first.data;
        first = first.next;
        if (Objects.isNull(first)) {
            last = null;
        }
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return first.data;
    }

    public boolean isEmpty() {
        return Objects.isNull(first);
    }
}
