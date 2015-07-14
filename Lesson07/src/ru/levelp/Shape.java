package ru.levelp;

/**
 * Created by vladimir on 14.07.15.
 */
abstract public class Shape {
    protected String name = "Shape";
    protected double square;
    protected String lineColor;
    protected String backgroundColor;

    public Shape(double square, String lineColor, String backgroundColor) {
        this.square = square;
        this.lineColor = lineColor;
        this.backgroundColor = backgroundColor;
    }

    public void show() {
        System.out.println(name+":\n\tsquare = " +square+
                "\n\tline color = "+lineColor+
                "\n\tbackground color = "+backgroundColor);
    }

    abstract public void paint();
}
