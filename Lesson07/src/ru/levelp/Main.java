package ru.levelp;

import java.util.ArrayList;

/**
 * Created by vladimir on 14.07.15.
 */
public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape(10, "black", "transparent");
//        shape.show();

        Rectangle rect = new Rectangle(4,6);
        rect.show();
        rect.paint();

        Circle circle = new Circle(10);
        circle.show();
        circle.paint();

        //полиморфизм = (ниже) + переопределение и перегрузка
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rect);
        shapes.add(circle);

    }
}
