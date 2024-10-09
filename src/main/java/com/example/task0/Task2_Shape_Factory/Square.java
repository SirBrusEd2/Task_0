package com.example.task0.Task2_Shape_Factory;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

// Квадрат
public class Square implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.BLUE);
        gr.fillRect(50, 50, 100, 100);
    }

    @Override
    public void descriptor() {

    }

    @Override
    public void setColor(Color color) {

    }
}