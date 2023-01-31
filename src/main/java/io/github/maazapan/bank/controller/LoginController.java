package io.github.maazapan.bank.controller;

import io.github.maazapan.bank.manager.bank.BankManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.stage.Stage;

public class LoginController {

    private final BankManager bankManager = new BankManager();

    @FXML
    private Button loginButton;
    @FXML
    private TextField mailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label infoLabel;
    @FXML
    private Label closeLabel;

    @FXML
    protected void onLoginButtonClick() {
        String password = passwordField.getText();
        String mail = mailField.getText();

        if (mail.isEmpty()) {
            infoLabel.setText("Por favor, ingrese su correo!");
            return;
        }
        if (password.isEmpty()) {
            infoLabel.setText("Por favor, ingrese su contraseña!");
            return;
        }
        if (!mail.equalsIgnoreCase(BankManager.ADMIN_MAIL) || !password.equalsIgnoreCase(BankManager.ADMIN_PASSWORD)) {
            infoLabel.setText("Correo o contraseña incorrectos!");
            return;
        }
        bankManager.login();
    }

    @FXML
    protected void onLoginMouseExited() {
        loginButton.setScaleY(1);
        loginButton.setScaleX(1);

        loginButton.setStyle("-fx-background-color: #4581cb");
    }

    @FXML
    protected void onLoginMouseEntered() {
        loginButton.setScaleY(1.05);
        loginButton.setScaleX(1.05);

        loginButton.setStyle("-fx-background-color: #356299");
    }

    @FXML
    protected void onMouseClickClose() {
        closeLabel.getScene().getWindow().hide();
    }

    @FXML
    protected void onMouseClickMinimize() {
        ((Stage) closeLabel.getScene().getWindow()).setIconified(true);
    }
}