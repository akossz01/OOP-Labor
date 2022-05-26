module com.example.labor13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labor13 to javafx.fxml;
    exports com.example.labor13;
}