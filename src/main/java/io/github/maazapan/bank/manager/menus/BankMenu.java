package io.github.maazapan.bank.manager.menus;

import io.github.maazapan.bank.BankApplication;

import java.net.URL;

public enum BankMenu {

    LOGIN_MENU(BankApplication.class.getResource("login-view.fxml")),
    MAIN_MENU(BankApplication.class.getResource("main-view.fxml"));

    private final URL resource;

    BankMenu(URL resource) {
        this.resource = resource;
    }

    public URL getResource() {
        return resource;
    }
}
