module com.example.tipcalculatormodification {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.tipcalculatormodification to javafx.fxml;
    exports com.example.tipcalculatormodification;
}