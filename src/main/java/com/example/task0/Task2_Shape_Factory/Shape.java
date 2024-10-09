package com.example.task0.Task2_Shape_Factory;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public interface Shape {
    void draw(GraphicsContext gr);

    void descriptor();

    void setColor(Color color);
}
