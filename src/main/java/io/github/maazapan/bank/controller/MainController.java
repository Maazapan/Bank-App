package io.github.maazapan.bank.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Label minimizeLabel;
    @FXML
    private Label addLabel;
    @FXML
    private Label removeLabel;
    @FXML
    protected Label requestLabel;

    @FXML
    protected void onMouseClickClose() {
        minimizeLabel.getScene().getWindow().hide();
    }

    @FXML
    protected void onMouseClickMinimize() {
        ((Stage) minimizeLabel.getScene().getWindow()).setIconified(true);
    }

    @FXML
    protected void onMouseEnteredAddLabel() {
        addLabel.setScaleX(1.1);
        addLabel.setScaleY(1.1);
    }

    @FXML
    protected void onMouseExitedAddLabel() {
        addLabel.setScaleX(1);
        addLabel.setScaleY(1);
    }

    @FXML
    protected void onMouseEnteredRemoveLabel() {
        removeLabel.setScaleX(1.1);
        removeLabel.setScaleY(1.1);
    }

    @FXML
    protected void onMouseExitedRemoveLabel() {
        removeLabel.setScaleX(1);
        removeLabel.setScaleY(1);
    }

    @FXML
    protected void onMouseExitedRequestLabel() {
           requestLabel.setScaleX(1);
            requestLabel.setScaleY(1);
    }
    @FXML
    protected void onMouseEnteredRequestLabel(){
        requestLabel.setScaleX(1.1);
        requestLabel.setScaleY(1.1);
    }
}
