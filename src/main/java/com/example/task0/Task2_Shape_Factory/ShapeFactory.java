package com.example.task0.Task2_Shape_Factory;

import javafx.scene.paint.Color;

public class ShapeFactory {
    public Shape createShape(int numberOfSides){
        if(numberOfSides==5){
            return new Pentagon(100, Color.GRAY);
        }
        else if(numberOfSides==4){
            return new Square();
        }
        else if(numberOfSides==3){
            return new Triangle();
        }
        else if(numberOfSides==2){
            return new Angle();
        }
        else if(numberOfSides==1){
            return new Line();
        }
        else if(numberOfSides==0){
            return new Circle();
        }
        else {
            return  null;
        }
    }
}
