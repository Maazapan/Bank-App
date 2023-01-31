package io.github.maazapan.bank.manager.menus;

import io.github.maazapan.bank.manager.sql.SQLManager;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MenuManager {

    public void loginMenu(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(BankMenu.LOGIN_MENU.getResource());
        Scene scene = new Scene(fxmlLoader.load(), 964, 523);

        stage.setResizable(true);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }

    public void mainMenu(Stage stage)  {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BankMenu.MAIN_MENU.getResource());

            Scene scene = new Scene(fxmlLoader.load(), 964, 523);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
