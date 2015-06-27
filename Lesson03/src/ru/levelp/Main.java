package ru.levelp;

/**
 * Created by vladimir on 26.06.15.
 */
public class Main {
    public static void main(String[] args) {
        //Создание объекта
        //Имя_класса имя_объекта = new Имя_класса();
        Human firstHuman = new Human("Dmitry", 24);
        System.out.println(firstHuman.age);
//        firstHuman.age = 24;
//        firstHuman.name = "Dmitry";

        System.out.println(firstHuman.name);

        Human secondHuman = new Human("Vasya", 22);

        firstHuman.talk(secondHuman);
        secondHuman.talk(firstHuman);
        //secondHuman.talk();

        firstHuman.renameOther(secondHuman);
        System.out.println("Name of secondHuman = " + secondHuman.name);

        MathOperations oper = new MathOperations();
        int a = 5;
        int b = 9;
        int res = oper.sum(a, b); //5, 8 - аргументы метода sum
        System.out.println(res);
        System.out.println(a);
    }
}
