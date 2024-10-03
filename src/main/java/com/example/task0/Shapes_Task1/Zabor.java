package com.example.task0.Shapes_Task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Zabor {
    private double width;
    private double height;
    private double posX;
    private double posY;

    public Zabor(double width, double height, double posX, double posY) {
        this.width = width;
        this.height = height;
        this.posX = posX;
        this.posY = posY;
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BROWN); // Цвет, приближенный к цвету дерева

        // Количество вертикальных полос заборов
        int numberOfPlanks = 7;
        double plankWidth = width / (numberOfPlanks + (numberOfPlanks - 1) * 0.5); // Учитываем промежутки между досками

        // Рисуем забор
        for (int i = 0; i < numberOfPlanks; i++) {
            double currentX = posX + i * (plankWidth + 0.5 * plankWidth); // Учитываем расстояние между досками
            gc.fillRect(currentX, posY, plankWidth, height); // Вертикальные доски

            // Добавляем дополнительные линии для текстуры дерева
            gc.setStroke(Color.BLACK);
            gc.setLineWidth(1);
            gc.strokeLine(currentX, posY, currentX, posY + height); // Вертикальная линия для текстуры
        }
    }
}