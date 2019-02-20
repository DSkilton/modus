package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.AlertBox;

import java.io.IOException;

public class loginController {
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private Button loginButton;
    @FXML private Button cancelButton;
    @FXML private Button helpButton;

    @FXML
    private void loginButtonAction(){
        loginButton.setOnAction(e -> loginCheck());

        loginButton.setOnAction(e -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getClassLoader().getResource("view/dashboard.fxml"));
                Scene sceneDash = new Scene(loader.load(), 800, 800);
                Stage stageDash = new Stage();
                stageDash.setTitle("Modus -> Dashboard");
                stageDash.setScene(sceneDash);
                stageDash.show();

            } catch(IOException e1){
                e1.getMessage();
            }
        });
    }

    @FXML
    private void cancelButtonAction(){
        cancelButton.setOnAction(e -> Platform.exit());
    }

    @FXML
    private void helpButtonAction(){
        helpButton.setOnAction(e -> AlertBox.display("Help", "Any issues please call your help desk on 01325 364578"));
    }

    //Static details for testing. Password would be converted to SHA-256 and stored in a database for future itterations
//    public static final String USERNAME = "admin";
//    public static final String PASSWORD = "admin";

    private void loginCheck(){
        String u = username.getText();
        String p = password.getText();

        System.out.println("Login");
        }
    } //end of login check
