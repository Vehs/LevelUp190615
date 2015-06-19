package ru.levelp;

/**
 * Created by vladimir on 19.06.15.
 */
public class FirstClass {
    public static void main(String[] args) {
        //первая команда
        /*
        комментарии
        ...
         */
        System.out.println("Мы на курсах \\компании \"LevelUp\"");
        //Мы на курсах компании "LevelUp"
        /*
        (\___/)
        (="."=)
        (")_(")
         */

        //numberOfStudents
        //int - целые числа
        int a = 10;
        //double - дробные числа (числа с плавающей точкой)
//        double b; //объявление переменной
//        b = 3.14; //инициализация переменной

        int c;
        c = (a + a + 2) / 3;
        System.out.println(c);

        //kx + b = 0
        //x = ...
        double k = 5;
        double b = 3;

        double x;
        x = -b / k;

        System.out.println("x = " + x);

        //long - целые числа (длинне, чем int)
        //boolean - хранит true/false
        boolean d = false;
        //char - символьный тип
        char ch = '5';
        int five = 5;
        five = ch;

        //String - строковая переменная
        String line = "blabla";
        line = line + " bla";
        System.out.println(line);

        a = 10;
        b = 10;
        if (a > b) {
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a < b");
        }

        //a,b,c - найти минимальное из чисел и вывести на экран
//        if (a < b && a < c) { // || - логическое или
//            System.out.println(a);
//        }
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println(min);

        //<,>,==
        //<=, >=
        //!= - не равно

        //ax^2 + bx + c = 0
        //D = b^2-4ac
        //1) D>0
        //      x1 = (-b+Math.sqrt(D))/(2*a)
        //      x2 = (-b-Math.sqrt(D))/(2*a)
        //2) D=0
        //      x1 = x2 = -b/(2*a)
        //3) D<0
        //      Корни комплексные
    }
    /*
    1) Прочитать: примитивные типы данных,
                логические операторы,
                сокращенные арифметические операторы,
                приведение типов.
    2) Сделать программе решения квадратного уравнения дружественный
        пользовательский интерфейс (в консоли).
    3) Найти как сделать так, чтобы ввод коэффициентов осуществлялся с
        клавиатуры.
    4) Нарисовать блок-схему алгоритма решения квадратного уравнения.
     */
}
