package com.example.task2.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class myAngle extends myShape {
    private double length;

    public myAngle(Color color, double x, double y, double x_end, double y_end, double length, Color color2)
    {
        super(color, x, y, color2);

        this.length=length;

    }

    public myAngle()
    {
        super(Color.RED,154,154, Color.GREEN);
        length=100;
    }


    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(this.color);
        gr.setStroke(Color.BLUE);
        gr.strokeLine(x,y,x+length*Math.cos(Math.PI/4),y+length*Math.sin(Math.PI/4));
        gr.strokeLine(x,y,x+length*Math.cos(3*Math.PI/4),y+length*Math.sin(3*Math.PI/4));

    }

    @Override
    public String toString() {
        return "myAngle";
    }
}
