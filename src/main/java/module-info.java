module PruevaEx {
    requires javafx.controls;
    requires javafx.fxml;

    opens PruevaEx to javafx.fxml;
    exports PruevaEx;
}