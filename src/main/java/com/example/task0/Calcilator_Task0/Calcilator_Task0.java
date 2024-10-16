package com.example.task0.Calcilator_Task0;

import javafx.scene.control.TextField;

public class Calcilator_Task0 {
    private TextField inputField;
    private TextField inputprocentField;
    private TextField resultField;
    private TextField totalField;

    public void setInputField(TextField inputField) {
        this.inputField = inputField;
    }

    public void setInputProcentField(TextField inputprocentField) {
        this.inputprocentField = inputprocentField;
    }

    public void setResultField(TextField resultField) {
        this.resultField = resultField;
    }

    public void setTotalField(TextField totalField) {
        this.totalField = totalField;
    }

    public void calculateBigTip() {
        calculateTip(15);
    }

    public void calculateNormalTip() {
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

    public void calculateSmallTip() {
        calculateTip(3);
    }

    private void calculateTip(double percent) {
        try {
            double billAmount = Double.parseDouble(inputField.getText());
            double tipAmount = billAmount * (percent / 100);
            double totalAmount = billAmount + tipAmount;
            resultField.setText(String.format("%.2f", tipAmount));
            totalField.setText(String.format("%.2f", totalAmount));
        } catch (NumberFormatException e) {
            resultField.setText("Ошибка ввода");
        }
    }
}
