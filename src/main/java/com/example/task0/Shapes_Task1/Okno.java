package com.example.task0.Shapes_Task1;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Okno {
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

    public void draw(GraphicsContext gc) {
        // Заливаем окно цветом
        gc.setFill(Color.rgb(22, 111, 203)); // Устанавливаем цвет заливки
        gc.fillRect(posX, posY, width, height); // Заливаем область окна

        // Обводим окно контуром
        gc.setStroke(Color.BLACK); // Устанавливаем цвет обводки
        gc.setLineWidth(1);         // Устанавливаем ширину линии обводки
        gc.strokeRect(posX, posY, width, height); // Рисуем контур окна
    }
}
