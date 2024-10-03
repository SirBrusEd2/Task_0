package com.example.task0;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField inputField;
    @FXML
    private TextField inputprocentField;
    @FXML
    private TextField resultField;
    @FXML
    private TextField totalField; // Для отображения полной суммы

    @FXML
    private void calculateBigTip() {
        calculateTip(15);
    }

    @FXML
    private void calculateNormalTip() {
        try {
            double billAmount = Double.parseDouble(inputprocentField.getText());
            if (billAmount == 10 || billAmount == 9) {
                calculateTip(billAmount);
            } else {
                resultField.setText("Введите один из предложенных вариантов");
            }
        } catch (NumberFormatException e) {
            resultField.setText("Ошибка ввода");
        }
    }

    @FXML
    private void calculateSmallTip() {
        calculateTip(3);
    }

    private void calculateTip(double percent) {
        try {
            double billAmount = Double.parseDouble(inputField.getText());
            double tipAmount = billAmount * (percent / 100);
            double totalAmount = billAmount + tipAmount; // Полная сумма
            resultField.setText(String.format("%.2f", tipAmount));
            totalField.setText(String.format("%.2f", totalAmount)); // Обновление поля с полной суммой
        } catch (NumberFormatException e) {
            resultField.setText("Ошибка ввода");
        }

    }
}