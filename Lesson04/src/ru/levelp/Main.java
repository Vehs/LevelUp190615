package ru.levelp;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by vladimir on 30.06.15.
 */
public class Main {

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("line1");
//        list.add("line2");
//
//        list.remove(0);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        MyArrayList myList = new MyArrayList();
//
//        myList.add(4);
//        myList.add(56);
//
//        myList.remove(0);
//        myList.remove(0);
//
//        myList.add(324);
//        for (int i = 0; i < myList.size; i++) {
//            System.out.println(myList.get(i));
//        }
//
//        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.add("sdfsdf");
//        String str = linkedList.get(0);
//        linkedList.remove(0);
//
//        ArrayList<Integer> intList = new ArrayList<Integer>();
//        int x = 5;
//        intList.add(x);
//        //int - Integer
//        //double - Double
//        //char - Character
//        //boolean - Boolean
//
        MyLinkedList<Integer> intLinkList = new MyLinkedList<Integer>();

//        intLinkList.add(0);
//        intLinkList.add(1);
//        intLinkList.add(2);
//        intLinkList.add(3);
        intLinkList.add(356);

        System.out.println(intLinkList.get(0));

//        ArrayList<String> arrayList = new ArrayList<String>();
//        LinkedList<String> linkedList = new LinkedList<String>();
//
//        for (int i = 0; i < 10000000; i++) {
//            //arrayList.add("hello");
//            linkedList.add("hello");
//        }
//        System.out.println("added");
//        for (int i = 0; i < linkedList.size(); i++) {
//            String s = linkedList.get(i);
//        }
    }

    /*
    1) Седжвик - связные списки
    2) Добавить в MyLinkedList методы: добавление по индексу, clear
    3) Изменить в MyArrayList хранение целых чисел на хранение контактов
        и привязать коллекцию к телефонной книге
     */
}
