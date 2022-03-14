package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    protected void onButtonClick() {
        label.setText("Button was clicked!");
    }

    public Button getButton() {
        return button;
    }

    public Label getLabel() {
        return label;
    }
}