package com.thinh.testf;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = 20;
        if(a > 5)
            App.setRoot("secondary");
    }
}
