package io.github.maazapan.bank.manager.bank;

import io.github.maazapan.bank.BankApplication;
import io.github.maazapan.bank.manager.menus.MenuManager;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class BankManager {

    public static String ADMIN_MAIL = "admin@gmail.com";
    public static String ADMIN_PASSWORD = "admin";

    public void login() {
        MenuManager menuManager = new MenuManager();
        menuManager.mainMenu(BankApplication.getStage());

        System.out.println("Successfully logged in!");
    }

    public void logout() {

    }

}
