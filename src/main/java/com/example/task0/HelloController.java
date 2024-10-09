package com.example.task0;

import com.example.task0.Shapes_Task1.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.canvas.GraphicsContext;
import com.example.task0.Shapes_Task1.Stupenki;
import com.example.task0.Task2_Shape_Factory.Shape;
import com.example.task0.Task2_Shape_Factory.ShapeFactory;
import javafx.scene.control.Alert;


public class HelloController {
    /* Task0 */
    /* @FXML
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
    } */
    /* Task1 */
    /*
    @FXML
    private Canvas canvas;

    @FXML
    private void handleDrawRoof() {
        clearCanvas();

        Figura krisha = new Krisha(220, 100, (canvas.getWidth() / 2) - 110, 200);
        drawFigura(krisha);
    }

    @FXML
    private void handleDrawWall() {
        clearCanvas();

        Figura stena = new Stena(200, 150, (canvas.getWidth() / 2) - 100, 200);
        drawFigura(stena);
    }

    @FXML
    private void handleDrawWindow() {
        clearCanvas();

        Figura okno = new Okno(80, 60, (canvas.getWidth() / 2) - 40, 200 + (150 / 4));
        drawFigura(okno);
    }

    @FXML
    private void handleDrawDoor() {
        clearCanvas();

        Figura stupenki = new Stupenki(30, 10, 109, 340, 3);
        drawFigura(stupenki);
    }

    @FXML
    private void handleDrawFence() {
        clearCanvas();

        Figura zabor = new Zabor(60, 100, (canvas.getWidth() / 2) + 100, 250);
        drawFigura(zabor);
    }

    @FXML
    private void handleDrawHouse() {
        clearCanvas();

        Figura stena = new Stena(200, 150, (canvas.getWidth() / 2) - 100, 200);
        drawFigura(stena);

        Figura krisha = new Krisha(220, 100, (canvas.getWidth() / 2) - 110, 200);
        drawFigura(krisha);

        Figura okno = new Okno(80, 60, (canvas.getWidth() / 2) - 40, 200 + (150 / 4));
        drawFigura(okno);

        Figura stupenki = new Stupenki(30, 10, 109, 340, 3);
        drawFigura(stupenki);

        Figura zabor = new Zabor(60, 100, (canvas.getWidth() / 2) + 100, 250);
        drawFigura(zabor);
    }

    private void drawFigura(Figura figura) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        figura.draw(gc);
    }

    private void clearCanvas() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }*/
    /* Task2 */

    @FXML
    private TextField value1; // Поле ввода для числа

    @FXML
    private Canvas can; // Поле рисования

    public void addPikcher() {
        GraphicsContext gr = can.getGraphicsContext2D();
        String inputText = value1.getText();

        if (!checkWithRegExp(inputText) || inputText.equals("")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0 до 5!");
            alert.showAndWait();
            return;
        }

        try {
            int numberOfSides = Integer.parseInt(inputText);

            if (numberOfSides < 0 || numberOfSides > 5) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Предупреждение: ");
                alert.setHeaderText(null);
                alert.setContentText("Число должно быть в диапазоне от 0 до 5!");
                alert.showAndWait();
                return;
            }

            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape1 = shapeFactory.createShape(numberOfSides);

            gr.clearRect(0, 0, can.getWidth(), can.getHeight());
            shape1.draw(gr);
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ошибка: ");
            alert.setHeaderText(null);
            alert.setContentText("Ошибка при преобразовании числа!");
            alert.showAndWait();
        }
    }

    private boolean checkWithRegExp(String input) {
        return input.matches("\\d");
    }
}
