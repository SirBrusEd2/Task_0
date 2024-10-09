package com.example.task0.Task2_Shape_Factory;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

// Прямая линия
public class Line implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(Color.BLACK);
        gr.setLineWidth(3);

        double startX = 50;
        double startY = 200;
        double endX = 350;
        double endY = 200;

        gr.strokeLine(startX, startY, endX, endY);
    }

    @Override
    public void descriptor() {

    }

    @Override
    public void setColor(Color color) {

    }
}
