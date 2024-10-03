package com.example.task0.Shapes_Task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Krisha {
    private double width;
    private double height;
    private double posX;
    private double posY;

    public Krisha(double width, double height, double posX, double posY) {
        this.width = width;
        this.height = height;
        this.posX = posX;
        this.posY = posY;
    }

    public void draw(GraphicsContext gc) {
        // Определяем точки для полигона
        double[] xPoints = {posX, posX + width / 2, posX + width};
        double[] yPoints = {posY, posY - height, posY};

        // Устанавливаем цвет заливки на бардовый с помощью RGB
        gc.setFill(Color.rgb(128, 0, 32));
        gc.fillPolygon(xPoints, yPoints, 3); // Заливаем крышу

        // Устанавливаем цвет обводки
        gc.setStroke(Color.DARKRED);
        gc.setLineWidth(1); // Устанавливаем ширину линии обводки
        gc.strokePolygon(xPoints, yPoints, 3); // Рисуем контур крыши
    }
}