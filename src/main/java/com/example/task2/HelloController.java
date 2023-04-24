package com.example.task2;

import com.example.task2.model.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public ColorPicker colorpicker;
    public TextField valuetext;
    public ColorPicker color1;
    public ListView list;
    private GraphicsContext gc;
    @FXML
    private Label welcomeText;

    myShape rect;
    myShape trig;
    myShape circ;

    @FXML
    private Canvas canvas;

    public ObservableList<myShape> figs;



    public void click(ActionEvent actionEvent) {
        rect = new myRect(colorpicker.getValue(),150,150,250*Math.random(),300*Math.random(), color1.getValue());
        rect.draw(gc);
    }

    public void click1(ActionEvent actionEvent) {
//        rect.setColor(colorpicker.getValue());
//        rect.draw(gc);
//        circ.setColor(colorpicker.getValue());
//        circ.draw(gc);
        //trig.setColor(colorpicker.getValue());
        //trig.draw(gc);
        //System.out.println(trig.toString());
    }

    public void click2(ActionEvent actionEvent) {
        trig=new myTriangle(colorpicker.getValue(),110*Math.random(),310*Math.random(), color1.getValue());
        trig.draw(gc);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        figs = FXCollections.observableArrayList();
        figs.add(new myTriangle());
        figs.add(new myAngle());
        figs.add(new myCircle());
        figs.add(new myRect());
        list.setItems(figs);
        gc = canvas.getGraphicsContext2D();

    }

    public void addShape(MouseEvent x) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int a = list.getSelectionModel().getSelectedIndex();
        myShape new_fig = figs.get(a).clone();
        new_fig.draw(gc);
    }


    public void click3(ActionEvent actionEvent) {
        circ=new myCircle(colorpicker.getValue(),150*Math.random(),50*Math.random(),140,140, color1.getValue());
        circ.draw(gc);
    }

    public void patclick(ActionEvent actionEvent) {
        if (valuetext.getText() == null || valuetext.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0 до 5!");
            alert.showAndWait();
            return;
        } else {
            //int numberside = Integer.parseInt(valuetext.getText());
            Factory shapefactory = new Factory();
            //myShape shape = shapefactory.createshape(numberside);
            myShape shape=shapefactory.creshape(valuetext.getText());
            //gc.clearRect(0, 0, 305, 440);
            shape.setColor(colorpicker.getValue());
            shape.setColor1(color1.getValue());
            gc.setStroke(shape.getColor());
            gc.setFill(shape.getColor1());
            gc.setLineWidth(10);
            shape.draw(gc);
        }
    }

    public void clear(ActionEvent actionEvent) {
        gc.clearRect(0,0, canvas.getHeight(), canvas.getWidth());
    }


}