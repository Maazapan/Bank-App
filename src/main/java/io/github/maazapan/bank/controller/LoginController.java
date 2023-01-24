package io.github.maazapan.bank.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginController {

    @FXML
    private Button loginButton;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println("xd");
    }

    @FXML
    protected void onLoginMouseExited() {
        loginButton.setScaleY(1);
        loginButton.setScaleX(1);
    }

    @FXML
    protected void onLoginMouseEntered() {
        loginButton.setScaleY(1.05);
        loginButton.setScaleX(1.05);
    }

    @FXML
    protected void onMouseClickClose() {
        System.exit(0);
    }
}