package com.example.task0.Shapes_Task1;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Stena {
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

    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BEIGE); // Устанавливаем цвет заполнения на бежевый
        gc.fillRect(posX, posY, width, height); // Заполняем стену бежевым цветом

        gc.setStroke(Color.BROWN); // Устанавливаем цвет обводки (можно выбрать любой)
        gc.setLineWidth(2); // Устанавливаем ширину линии обводки
        gc.strokeRect(posX, posY, width, height); // Рисуем контур стенки
    }
}