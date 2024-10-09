package com.example.task0.Task2_Shape_Factory;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

// Круг
public class Circle implements Shape{
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.GREEN);
        gr.fillOval(25,25,225,225);
    }

    @Override
    public void descriptor() {

    }

    @Override
    public void setColor(Color color) {

    }
}
