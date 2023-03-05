package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class myCircle extends myShape{

    private double length;
    private double width;


    public myCircle(Color color, double x, double y,double length, double width) {
        super(color, x, y);
        this.width=width;
        this.length=length;
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillOval(x,y,length,width);
    }
}
