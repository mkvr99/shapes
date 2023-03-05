package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class myShape {
    //параметры фигуры - приватные поля
    protected Color color;

    protected double x, y;


    // объявление абстрактных методов

    abstract void draw(GraphicsContext gr);

    // конструктор
    public myShape(Color color, double x, double y) {
        System.out.println("Shape constructor called");
        this.color = color;
        this.x=x;
        this.y=y;

    }


    // реализация методов
    public void setColor(Color color) {
        this.color=color; }

    public Color getColor() {
        return color;
    }
}
