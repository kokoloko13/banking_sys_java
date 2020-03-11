package banking_sys;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

//        Tab tabClient = new Tab("Client");
//        Tab tabEmployee = new Tab("Employee");
//
//        GridPane gridPane = new GridPane();
//        GridPane gridPaneClient = new GridPane();
//
//        TabPane tabPane = new TabPane();
//        tabPane.setPrefSize(400,200);
//        tabPane.setSide(Side.LEFT);
//        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
//
//        tabPane.getTabs().addAll(tabClient, tabEmployee);
//
//
//        VBox vBox = new VBox(tabPane);
//        GridPane.setColumnIndex(vBox, 0);
//        GridPane.setRowIndex(vBox, 0);
//        GridPane.setRowSpan(vBox, 3);
//
//        gridPane.add(vBox, 0, 3);
//
//        Scene scene = new Scene(gridPane, 700, 200);
//
//        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap");
//
//
//        // LOGIN FORM //
//        TextField login = new TextField();
//        login.setPromptText("Enter your login here");
//        GridPane.setColumnIndex(login, 2);
//        GridPane.setRowIndex(login, 0);
//
//
//        PasswordField pswd = new PasswordField();
//        pswd.setPromptText("Enter your password here");
//        GridPane.setColumnIndex(pswd, 2);
//        GridPane.setRowIndex(pswd, 1);
//
//        Label loginLabel = new Label();
//        loginLabel.setLabelFor(login);
//        GridPane.setColumnIndex(loginLabel, 1);
//        GridPane.setRowIndex(loginLabel, 0);
//
//
//        Label pswdLabel = new Label();
//        pswdLabel.setLabelFor(pswd);
//        GridPane.setColumnIndex(pswdLabel, 1);
//        GridPane.setRowIndex(pswdLabel, 1);
//
//        Button loginButton = new Button();
//        loginButton.setText("Log In");
//        GridPane.setColumnIndex(loginButton, 1);
//        GridPane.setRowIndex(loginButton, 2);
//        GridPane.setColumnSpan(loginButton, 2);
//        loginButton.setAlignment(Pos.CENTER);
//
//
//        gridPaneClient.getChildren().addAll(loginLabel, login, pswdLabel, pswd, loginButton);
//        gridPaneClient.setGridLinesVisible(true);
//
//        tabClient.setContent(gridPaneClient);
//
//        // END OF LOGIN FORM //
//
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Banking System Login");
//
//        primaryStage.show();



        Parent loginRoot = FXMLLoader.load(getClass().getResource("Login.fxml"));


        primaryStage.setTitle("Banking System Login");
        Scene scene = new Scene(loginRoot);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap");

       primaryStage.getIcons().add(new Image("file:///C:/Users/Dell/Desktop/banking_sys_java/src/banking_sys/img/dollar.png"));


        primaryStage.show();


    }
}
