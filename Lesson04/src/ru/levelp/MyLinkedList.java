package ru.levelp;

/**
 * Created by vladimir on 30.06.15.
 */
public class MyLinkedList<T> {
    Node<T> head;
    int size;

    public MyLinkedList() {
        size = 0;
    }

    public void add(T obj) {
        if (size == 0) {
            head = new Node<T>(obj);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            //current - последний элемент списка
            current.next = new Node<T>(obj);
        }
        size++;
    }

    public boolean remove(int index) {
        if (size == 0 || index < 0 || index >= size)
            return false;
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
        return true;
    }

    public T get(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    /*
    Седжвик "Алгоритмы н Java" - Связные списки
     */
}
