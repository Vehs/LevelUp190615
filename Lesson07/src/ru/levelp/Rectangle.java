package ru.levelp;



/**
 * Created by vladimir on 14.07.15.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;
    private double angle;

    /*
    Перегрузка конструкторов
    Признаки отличия:
    1) Количество параметров
    2) Типы параметров
    3) Порядок типов параметров
     */
    public Rectangle(double width, double height) {
        super(width * height, "black", "transparent");
        this.width = width;
        this.height = height;
        this.angle = 0;
        this.name = "Rectangle";
    }

    public Rectangle(double width, double height, double angle) {
        super(width * height, "black", "transparent");
        this.width = width;
        this.height = height;
        this.angle = angle;
        this.name = "Rectangle";
    }

    public Rectangle(double width, double height, double angle,
                     String lineColor, String backgroundColor) {
        super(width * height, lineColor, backgroundColor);
        this.width = width;
        this.height = height;
        this.angle = angle;
        this.name = "Rectangle";
    }

    //переопределение метода show()
    @Override
    public void show() {
        super.show(); //вызываем родительский show()
        System.out.println("\twidth = " + width);
        System.out.println("\theight = " + height);
        System.out.println("\tangle = " + angle);
    }

    @Override
    public void paint() {
        System.out.println(" ______");
        System.out.println("|      |");
        System.out.println(" ------");
    }
}

/*
class Base {
    method() {...}
}

class A extends Base {
    @Override
    method() {111}
}

class B extends Base {
    @Override
    method() {222}
}

class Child extends A, B {

}

Child c = new Child();
c.method();
 */
