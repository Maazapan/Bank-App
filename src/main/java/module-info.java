module io.github.maazapan.bank {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.maazapan.bank to javafx.fxml;
    exports io.github.maazapan.bank;
    exports io.github.maazapan.bank.controller;
    opens io.github.maazapan.bank.controller to javafx.fxml;
}