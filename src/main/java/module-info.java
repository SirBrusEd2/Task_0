module com.example.task0 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.task0 to javafx.fxml;
    exports com.example.task0;
    exports com.example.task0.Calcilator_Task0;
    opens com.example.task0.Calcilator_Task0 to javafx.fxml;
}