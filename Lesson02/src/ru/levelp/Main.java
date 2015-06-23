package ru.levelp;

/**
 * Created by vladimir on 23.06.15.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 4;
        array[1] = 6;
        array[2] = 4564;
        array[3] = 564;
        array[4] = -235;

        int[] array2 = {4, 7, 5, 8};
        String[] strs = {"line1", "line2"};
        //sout
        System.out.println(strs[1]);

        int i = 0;
        while (i < 4) {
            System.out.println("blabla");
            ++i;
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(array[j]);
        }
        for (int j = 0; j < 10; j++) {
            if (j < 4) {
                System.out.print("word ");
            } else {
                System.out.println("word");
            }
        }
        //...
        /*
        1 2 3 4 5 6 7 8 9
        2 4 6 8 10 12 14 16 18
        ...
        9...                81
         */
        //\t - табуляция
        //array.length;

        for (int j = 1; j < 10; j++) {
            for (int k = 1; k < 10; k++) {
                System.out.printf("%2d ", j * k);
            }
            System.out.println();
        }
        //System.out.printf("array[0] = %3d, array[1] = %3d", array[0], array[1]);
        //%d - int
        //%s - String
        //%c - char
        //%lf - double

        //Массив со случайными числами
        int[] arr = new int[10];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) (Math.random() * 150 + 50); //0..1
            System.out.println(arr[j]);
        }
        //Поиск минимума
        //Integer.MAX_VALUE

        int min = arr[0];
        for (int j = 1; j < 10; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.println("min = " + min);

        //A = {5, 6, 8, 3, 9} - массив случайных чисел
        //B = {2, 1, 1, 2, 2}

        int[] A = new int[20];
        int[] B = new int[A.length];
        for (int j = 0; j < A.length; j++) {
            A[j] = (int) (Math.random() * 10); //0..1
        }

        int count = 0;
        for (int j = 0; j < B.length; j++) {
            if (A[j] % 2 == 0) {
                for (int k = 0; k < A.length; k++) {
                    if (A[k] % 2 == 0) {
                        count++;
                    }
                }
            } else {
                for (int k = 0; k < A.length; k++) {
                    if (A[k] % 2 != 0) {
                        count++;
                    }
                }
            }
            B[j] = count - 1;
            count = 0;
        }
        //Дома сделать без вложенных циклов!

        int a = 6;
        int b = 7;

        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1; k++) {
                if (arr[k] > arr[k+1]) {
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    /*
    ДЗ
    1) Доделать задачу с А и В, используя один цикл
    2) Сортировка пузырьком (оптимизировать)
    3) Реализовать два любых других алгоритма сортировки
        (лучше один из них придумать свой)
    4) Прочитать про цикл do-while и про конструкцию switch-case
     */
}
