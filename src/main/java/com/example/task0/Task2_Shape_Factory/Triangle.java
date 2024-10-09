package com.example.task0.Task2_Shape_Factory;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

// Треугольник
public class Triangle implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.YELLOW);
        double[] xPoints = {150, 200, 100};
        double[] yPoints = {50, 150, 150};
        gr.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public void descriptor() {

    }

    @Override
    public void setColor(Color color) {

    }
}