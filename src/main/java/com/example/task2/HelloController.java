package com.example.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public ColorPicker colorpicker;
    private GraphicsContext gc;
    @FXML
    private Label welcomeText;

    myShape rect;
    myShape trig;
    myShape circ;

    @FXML
    private Canvas canvas;


    @FXML
    protected void Click() {

    }


    public void click(ActionEvent actionEvent) {


        rect = new myRect(colorpicker.getValue(),150,150,250*Math.random(),300*Math.random());
        rect.draw(gc);

        /*GraphicsContext gc = canvas.getGraphicsContext2D();

        //RoundRectangle
        gc.setLineWidth(2.0);
        // установка цвета
        gc.setFill(Color.AQUAMARINE);
        //рисование скругленного прямоугольника
        gc.strokeRoundRect(100, 10, 50, 50, 10, 10);
        // закрашивание скругленного прямоугольника
        gc.fillRoundRect(100, 10, 50, 50, 10, 10);

        double [] x= new double[5];
        double [] y=new double[5];
        x[0]=100;
        y[0]=100;
        x[1]=50;
        y[1]=150;
        x[2]=50;
        y[2]=200;
        x[3]=150;
        y[3]=200;
        x[4]=150;
        y[4]=150;
        gc.fillPolygon(x,y,5);
         */

    }

    public void click1(ActionEvent actionEvent) {
//        rect.setColor(colorpicker.getValue());
//        rect.draw(gc);
//        circ.setColor(colorpicker.getValue());
//        circ.draw(gc);
        trig.setColor(colorpicker.getValue());
        trig.draw(gc);
        //System.out.println(trig.toString());
    }

    public void click2(ActionEvent actionEvent) {
        trig=new myTriangle(colorpicker.getValue(),110*Math.random(),310*Math.random());
        trig.draw(gc);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
    }

    public void click3(ActionEvent actionEvent) {
        circ=new myCircle(colorpicker.getValue(),150*Math.random(),50*Math.random(),140,140);
        circ.draw(gc);
    }
}