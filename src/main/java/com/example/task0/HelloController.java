package com.example.task0;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

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
    }
}