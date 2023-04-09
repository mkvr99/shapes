package com.example.task2.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Factory implements IFactory{

    Map<Integer,myShape> figures = new HashMap<>();
    Map<String,myShape> figures_name=new HashMap<>();



    public myShape createshape(int numberOfSides) {


        figures.put(0,new myCircle());
        figures.put(2,new myAngle());
        figures.put(3,new myTriangle());
        figures.put(4,new myRect());
        return figures.get(numberOfSides);


    }

    public myShape creshape(String name) {

        figures_name.put(new myCircle().toString(),new myCircle());
        figures_name.put(new myAngle().toString(),new myAngle());
        figures_name.put(new myTriangle().toString(),new myTriangle());
        figures_name.put(new myRect().toString(),new myRect());
        return figures_name.get(name);
    }
}
