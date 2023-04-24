package com.example.task2.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class myRect extends myShape {
        double length;
        double width;


       public myRect(){
           super(Color.PINK,140*Math.random(),130*Math.random(), Color.GREEN);
           length=200;
           width=100;
       }


    public myRect(Color color, double length, double width, double x, double y, Color color1) {
            // calling Shape constructor
            super(color,x,y, color1);
            this.length = length;
            this.width = width;
    }




        @Override
        public void draw(GraphicsContext gr) {
            gr.setFill(this.color);
            gr.fillRect(this.x, this.y,length,width);
            gr.setStroke(this.color1);
            gr.strokeRect(this.x, this.y,length,width);
        }


    @Override
    public String toString() {
        return "Rectangle";
    }

}