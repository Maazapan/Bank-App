package io.github.maazapan.bank.manager;

import io.github.maazapan.bank.manager.menus.BankMenu;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BankManager {


    public void loadLoginMenu(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(BankMenu.LOGIN_MENU.getResource());
        Scene scene = new Scene(fxmlLoader.load(), 964, 523);

        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setIconified(false);
        stage.setScene(scene);
        stage.show();
    }
}
