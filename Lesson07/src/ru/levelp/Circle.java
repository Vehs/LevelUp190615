package ru.levelp;

/**
 * Created by vladimir on 14.07.15.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(Math.PI * radius * radius, "black", "transparent");
        this.radius = radius;
        this.name = "Circle";
    }

    public Circle(double radius, String lineColor, String backgroundColor) {
        super(Math.PI * radius * radius, lineColor, backgroundColor);
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    public void show() {
        super.show();
        System.out.println("\tradius = " + radius);
    }

    @Override
    public void paint() {
        System.out.println("( )");
    }
}
