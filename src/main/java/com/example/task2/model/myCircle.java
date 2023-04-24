package com.example.task2.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class myCircle extends myShape {

    private double length;
    private double width;


    public myCircle(Color color, double x, double y,double length, double width, Color color1) {
        super(color, x, y, color1);
        this.width=width;
        this.length=length;
    }

    public myCircle() {
        super(Color.BLACK,200*Math.random(),200*Math.random(), Color.PINK);
        length=100;
        width=200;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillOval(x,y,length,width);
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
