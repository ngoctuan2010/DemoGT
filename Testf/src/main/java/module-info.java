module com.thinh.testf {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.thinh.testf to javafx.fxml;
    exports com.thinh.testf;
}
