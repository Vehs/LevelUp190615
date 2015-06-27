package ru.levelp;

/**
 * Created by vladimir on 26.06.15.
 */
public class Human {

    int age;
    String name;

    //Конструктор
    //1. Почти всегда public
    //2. Никогда не возвращает результат
    //3. Имя совпадает с именем класса
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void talk(Human man) {
        System.out.println(name + " say \"Hello, " + man.name + "!\"");
    }

    public void renameOther(Human man) {
        man.name = "NewName";

        String s1 = "bla";
        String s2 = "bla";

        if (name.equals(s2)) {
            System.out.println("РАВНЫ");
        }
    }
}

/* PhoneBook
Меню:
1. Добавить контакт
2. Удалить контакт
3. Вывести все контакты

Пользователь вводит номер пункта
Scanner scan = new Scanner(System.in);

int answer = scan.nextInt();
String name = scan.next();

1:
    Предлагается ввести имя, телефон, email
    После ввода создается объект класса Contact и добавляется в массив
    Contact[] book = new Contact[20];
    book[size] = new Contact(name, phone, email);
    size++;
2:
    Предлагается ввести имя
    Объект с этим именем удаляется из массива
    1 2 X 4 5
    1 2 4 5
    size--;
3:
    Вывод построчно всех контактов

Рекомендации:
    Хранить в переменной количество контактов


4:
    Редактирование контакта
 */