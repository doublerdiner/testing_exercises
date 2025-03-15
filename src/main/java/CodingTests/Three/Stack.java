package CodingTests.Three;

import java.util.EmptyStackException;
import java.util.Objects;

public class Stack<T> {
    private StackNode<T> top;

    private int size = 0;

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T data) {
        StackNode<T> newNode = new StackNode<>(data);
        newNode.next = top;
        top = newNode;
        size += 1;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size -= 1;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return Objects.isNull(top);
    }

    public int size() {
        return size;
    }
}

