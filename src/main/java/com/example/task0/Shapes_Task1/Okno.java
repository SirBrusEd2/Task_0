package com.example.task0.Shapes_Task1;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Okno extends Figura {
    private double width;
    private double height;
    private double posX;
    private double posY;

    public Okno(double width, double height, double posX, double posY) {
        this.width = width;
        this.height = height;
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.rgb(22, 111, 203));
        gc.fillRect(posX, posY, width, height);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
        gc.strokeRect(posX, posY, width, height);
    }
}
