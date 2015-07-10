package ru.levelp;

/**
 * Created by vladimir on 30.06.15.
 */
public class MyArrayList {
    int[] objects = null;
    int size;

    public MyArrayList() {
        size = 0;
    }

//    Contact c = new Contact(name,email,phone);
//    book.add(c);
    public void add(int obj) {
        //1) Создаем массив на 1 размером больше
        //2) Копируем из objects в новый массив все элементы
        //3) На последнюю позицию нового массива записываем obj
        //4) objects = новый массив

        //добавление первого элемента
        if (size == 0) {
            objects = new int[1];
            objects[0] = obj;
        } else {
            int[] newObjects = new int[size + 1];
            for (int i = 0; i < objects.length; i++) {
                newObjects[i] = objects[i];
            }
            newObjects[size] = obj; //size == objects.length - последний индекс
            //массива newObjects
            objects = newObjects;
        }
        size++;
    }

    public int get(int index) {
        return objects[index];
    }

    public boolean remove(int index) {
        //1) Создаем массив на 1 размером меньше
        //2) Копируем из objects в новый массив все элементы, кроме index
        //3) objects = новый массив
        //4) При удачном удалении - true, иначе - false
        if (size == 0 || index < 0 || index >= size)
            return false;
        int[] newObjects = new int[size - 1];
        for (int i = 0; i < index; i++) {
            newObjects[i] = objects[i];
        }//
        for (int i = index + 1; i < size; i++) {
            newObjects[i - 1] = objects[i];
        }
        //1 2 3 4 5
        //1 2 4 5
        objects = newObjects;
        size--;
        return true;
    }

    public void clear() {
        size = 0;
        objects = null;
    }

    /**
     * Вставка элемента по индексу
     *
     * @param obj   добавляемый элемент
     * @param index позиция, на которую помещается obj
     * @return true, если вставка успешна, иначе - false
     */
    public boolean add(int obj, int index) {
        if (index < 0 || index > size)
            return false;
        if (index == size) {
            add(obj);
            return true;
        }

        int[] newObjects = new int[size + 1];
        for (int i = 0; i < index; i++) {
            newObjects[i] = objects[i];
        }
        newObjects[index] = obj;
        for (int i = index + 1; i < size + 1; i++) {
            newObjects[i] = objects[i - 1];
        }
        objects = newObjects;
        size++;
        return true;
    }
}
