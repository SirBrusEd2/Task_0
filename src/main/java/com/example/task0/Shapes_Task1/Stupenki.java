package com.example.task0.Shapes_Task1;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Stupenki {
    private double stepWidth;  // Ширина каждой ступеньки
    private double stepHeight; // Высота каждой ступеньки
    private double posX;       // Позиция по оси X
    private double posY;       // Позиция по оси Y
    private int numberOfSteps; // Количество ступенек

    public Stupenki(double stepWidth, double stepHeight, double posX, double posY, int numberOfSteps) {
        this.stepWidth = stepWidth;
        this.stepHeight = stepHeight;
        this.posX = posX;
        this.posY = posY;
        this.numberOfSteps = numberOfSteps;
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(Color.GRAY); // Цвет, приближенный к цвету дерева

        // Рисуем каждую ступеньку
        for (int i = 0; i < numberOfSteps; i++) {
            // Определяем позицию для каждой ступеньки
            double x = posX + i * stepWidth;          // Сдвигаем по X
            double y = posY - (i * stepHeight);       // Сдвигаем по Y

            gc.fillRect(x, y, stepWidth, stepHeight); // Рисуем ступеньку

            // Добавляем обводку для каждой ступеньки
            gc.setStroke(Color.GRAY);
            gc.setLineWidth(1);
            gc.strokeRect(x, y, stepWidth, stepHeight); // Обводка ступеньки
        }
    }
}
