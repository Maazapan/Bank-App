package io.github.maazapan.bank;

import io.github.maazapan.bank.manager.BankManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class BankApplication extends Application {

    private final BankManager bankManager = new BankManager();
    private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        bankManager.loadLoginMenu(stage);
        BankApplication.stage = stage;
    }

    public static void main(String[] args) {
        launch();
    }

    public static Stage getStage() {
        return stage;
    }
}