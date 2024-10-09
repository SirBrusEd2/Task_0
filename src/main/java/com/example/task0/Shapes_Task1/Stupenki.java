package com.example.task0.Shapes_Task1;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Stupenki extends Figura {
    private double stepWidth;
    private double stepHeight;
    private double posX;
    private double posY;
    private int numberOfSteps;

    public Stupenki(double stepWidth, double stepHeight, double posX, double posY, int numberOfSteps) {
        this.stepWidth = stepWidth;
        this.stepHeight = stepHeight;
        this.posX = posX;
        this.posY = posY;
        this.numberOfSteps = numberOfSteps;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.GRAY);
        for (int i = 0; i < numberOfSteps; i++) {
            double x = posX + i * stepWidth;
            double y = posY - (i * stepHeight);
            gc.fillRect(x, y, stepWidth, stepHeight);
            gc.setStroke(Color.GRAY);
            gc.setLineWidth(1);
            gc.strokeRect(x, y, stepWidth, stepHeight);
        }
    }
}
