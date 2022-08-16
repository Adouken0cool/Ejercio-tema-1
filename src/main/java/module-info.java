module com.example.proyecto0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecto0 to javafx.fxml;
    exports com.example.proyecto0;
}