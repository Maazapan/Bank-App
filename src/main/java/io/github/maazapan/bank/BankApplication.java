package io.github.maazapan.bank;

import io.github.maazapan.bank.manager.menus.MenuManager;
import io.github.maazapan.bank.manager.sql.SQLManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class BankApplication extends Application {

    private final MenuManager menuManager = new MenuManager();
    private final SQLManager sqlManager = new SQLManager();

    private static Stage STAGE;

    @Override
    public void start(Stage stage) throws Exception {
            menuManager.loginMenu(stage);
        //menuManager.mainMenu(stage);
        sqlManager.connect();
        STAGE = stage;
    }

    public static void main(String[] args) {
        launch();
    }

    public static Stage getStage() {
        return STAGE;
    }
}