module com.example.task0 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.task0 to javafx.fxml;
    exports com.example.task0;
}