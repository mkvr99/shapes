package com.example.task2.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class myShape implements Cloneable{
    //параметры фигуры - приватные поля
    protected Color color;
    protected Color color1;

    protected double x, y;

    public myShape() {

    }

    // объявление абстрактных методов

    public abstract void draw(GraphicsContext gr);

    // конструктор
    public myShape(Color color, double x, double y, Color color1) {
        System.out.println("Shape constructor called");
        this.color = color;
        this.x=x;
        this.y=y;
        this.color1=color1;

    }


    // реализация методов
    public void setColor(Color color) {
        this.color=color;

    }

    public myShape clone(){
        Object clone = null;
        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e)

        {
            e.printStackTrace();
        }
        return (myShape) clone;
    }

    public void setColor1 (Color color1) {
        this.color1=color1;
    }

    public Color getColor() {
        return color;
    }

    public Color getColor1() {
        return color1;
    }

    @Override
    public String toString() {
        return "Shape";
    }
}
