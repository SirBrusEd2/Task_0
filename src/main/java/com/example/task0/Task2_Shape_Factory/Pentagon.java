package com.example.task0.Task2_Shape_Factory;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

// Пятиугольник
public class Pentagon implements Shape {
    private double side;
    private Color color;

    public Pentagon(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);

        double[] xPoints = new double[5];
        double[] yPoints = new double[5];
        double angle = Math.PI / 180 * 72;
        double radius = side / (2 * Math.sin(Math.PI / 5));

        for (int i = 0; i < 5; i++) {
            xPoints[i] = 100 + radius * Math.cos(angle * i);
            yPoints[i] = 100 + radius * Math.sin(angle * i);
        }

        gc.fillPolygon(xPoints, yPoints, 5);
    }

    @Override
    public void descriptor() {
        System.out.println("Пятиугольник с длиной стороны: " + side + " и цветом: " + color);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}