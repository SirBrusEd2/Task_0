package com.example.task0;

import com.example.task0.Shapes_Task1.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.canvas.GraphicsContext;
import com.example.task0.Shapes_Task1.Stupenki;


public class HelloController {
    /* Task0
    @FXML
    private TextField inputField; // Поле для ввода суммы
    @FXML
    private TextField inputprocentField; // Поле для ввода процента
    @FXML
    private TextField resultField; // Поле для отображения результата
    @FXML
    private TextField totalField; // Поле для отображения полной суммы

    private Calcilator_Task0 calculator;

    // Инициализация контроллера
    @FXML
    public void initialize() {
        calculator = new Calcilator_Task0();
        // Передаем ссылки на TextField в калькулятор
        calculator.setInputField(inputField);
        calculator.setInputProcentField(inputprocentField);
        calculator.setResultField(resultField);
        calculator.setTotalField(totalField);
    }

    @FXML
    private void handleCalculateBigTip() {
        calculator.calculateBigTip();
    }

    @FXML
    private void handleCalculateNormalTip() {
        calculator.calculateNormalTip();
    }

    @FXML
    private void handleCalculateSmallTip() {
        calculator.calculateSmallTip();
    }*/
    /* Task1 */

    @FXML
    private Canvas canvas;

    @FXML
    private void handleDrawRoof() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        clearCanvas();

        Krisha krisha = new Krisha(220, 100, (canvas.getWidth() / 2) - 110, 200);
        krisha.draw(gc);
    }

    @FXML
    private void handleDrawWall() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        clearCanvas();

        Stena stena = new Stena(200, 150, (canvas.getWidth() / 2) - 100, 200);
        stena.draw(gc);
    }

    @FXML
    private void handleDrawWindow() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        clearCanvas();

        Okno okno = new Okno(80, 60, (canvas.getWidth() / 2) - 40, 200 + (150 / 4));
        okno.draw(gc);
    }

    @FXML
    private void handleDrawDoor() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        clearCanvas();

        Stupenki stupenki = new Stupenki(30, 10, 109, 340, 3);
        stupenki.draw(gc);
    }

    @FXML
    private void handleDrawFence() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        clearCanvas();

        Zabor zabor = new Zabor(60, 100, (canvas.getWidth() / 2) + 100, 250);
        zabor.draw(gc);
    }

    @FXML
    private void handleDrawHouse() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        clearCanvas();

        Stena stena = new Stena(200, 150, (canvas.getWidth() / 2) - 100, 200);
        stena.draw(gc);

        Krisha krisha = new Krisha(220, 100, (canvas.getWidth() / 2) - 110, 200);
        krisha.draw(gc);

        Okno okno = new Okno(80, 60, (canvas.getWidth() / 2) - 40, 200 + (150 / 4));
        okno.draw(gc);

        Stupenki stupenki = new Stupenki(30, 10, 109, 340, 3);
        stupenki.draw(gc);

        Zabor zabor = new Zabor(60, 100, (canvas.getWidth() / 2) + 100, 250);
        zabor.draw(gc);
    }

    private void clearCanvas() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}