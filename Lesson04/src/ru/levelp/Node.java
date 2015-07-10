package ru.levelp;

/**
 * Created by vladimir on 30.06.15.
 */
public class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }
}
