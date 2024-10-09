package com.example.task0.Shapes_Task1;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Stena extends Figura {
    private double width;
    private double height;
    private double posX;
    private double posY;

    public Stena(double width, double height, double posX, double posY) {
        this.width = width;
        this.height = height;
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BEIGE);
        gc.fillRect(posX, posY, width, height);
        gc.setStroke(Color.BROWN);
        gc.setLineWidth(2);
        gc.strokeRect(posX, posY, width, height);
    }
}