package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class myTriangle extends myShape{
    public myTriangle(Color color, double x, double y) {
        super(color, x, y);
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.setLineWidth(2.0);
        gr.moveTo(this.x,this.y);
        gr.lineTo(this.x+105,this.y+155);
        gr.lineTo(this.x+40,this.y+160);
        gr.fill();

    }

}
