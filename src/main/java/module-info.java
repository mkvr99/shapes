module com.example.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task2 to javafx.fxml;
    exports com.example.task2;
    exports com.example.task2.model;
    opens com.example.task2.model to javafx.fxml;
}