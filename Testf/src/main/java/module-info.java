module com.thinh.testf {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens com.thinh.testf to javafx.fxml;
    exports com.thinh.testf;
}
