package com.example.task2.model;

import com.example.task2.model.myShape;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class myTriangle extends myShape {
    public myTriangle(Color color, double x, double y, Color color2) {
        super(color, x, y, color2);
    }

    public myTriangle() {
        super(Color.BLUE,300*Math.random(),200*Math.random(), Color.BLACK);

    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.setLineWidth(2.0);
        gr.moveTo(this.x,this.y);
        gr.lineTo(this.x+105,this.y+155);
        gr.lineTo(this.x+40,this.y+160);
        gr.fill();

    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
