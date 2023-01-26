package io.github.maazapan.bank;

import io.github.maazapan.bank.manager.menus.MenuManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class BankApplication extends Application {

    private final MenuManager menuManager = new MenuManager();
    private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        menuManager.loginMenu(stage);
        BankApplication.stage = stage;
    }

    public static void main(String[] args) {
        launch();
    }

    public static Stage getStage() {
        return stage;
    }
}