package ru.levelp;

/**
 * Created by vladimir on 30.06.15.
 */
public class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        size = 0;
    }

    public void add(int obj) {
        if (size == 0) {
            head = new Node(obj);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            //current - последний элемент списка
            current.next = new Node(obj);
        }
        size++;
    }

    public boolean remove(int index) {
        if (size == 0 || index < 0 || index >= size)
            return false;
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
        return true;
    }

    public int get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    /*
    Седжвик "Алгоритмы н Java" - Связные списки
     */
}
