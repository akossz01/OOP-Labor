package com.example.labor13;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    private int pressCount = 0;
    @FXML
    private Label welcomeText;
    @FXML
    private Button buttonText;

    @FXML
    protected void onHelloButtonClick() {
        pressCount++;
        buttonText.setText("Pressed: " + pressCount);
    }
}