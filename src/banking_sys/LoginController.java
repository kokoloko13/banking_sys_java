package banking_sys;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    public GridPane gridPane;

    public void employeeLogin(){
    }

    public void clientLogin() throws IOException {

        Parent clientRoot = FXMLLoader.load(getClass().getResource("clientPanel.fxml"));
        Scene clientPanelScene = new Scene(clientRoot);

        Stage stage = (Stage) gridPane.getScene().getWindow();

        stage.setScene(clientPanelScene);

    }

}
