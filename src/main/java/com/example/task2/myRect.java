package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class myRect extends myShape{
        double length;
        double width;



    public myRect(Color color, double length, double width, double x, double y) {
            // calling Shape constructor
            super(color,x,y);
            this.length = length;
            this.width = width;
    }

        @Override
        void draw(GraphicsContext gr) {
            gr.setFill(this.color);
            gr.fillRect(this.x, this.y,length,width);
        }


        @Override
        public String toString() {

            return "Rectangle color is " + super.color;}

}