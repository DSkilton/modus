package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.AlertBox;

public class loginController {
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private Button loginButton;
    @FXML private Button cancelButton;
    @FXML private Button helpButton;

    @FXML private javafx.scene.control.Button closeButton;
//    @FXML private javafx.scene.control.Button cancelButton;
//    @FXML private javafx.scene.control.Button helpButton;

    @FXML
    private void loginButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
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
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "admin";

    private void loginCheck() {
        try {
            String u = username.getText();
            String p = password.getText();

            if((u != USERNAME) && (p != PASSWORD)) {
                AlertBox.display("Check loginController Details ", "loginController details are not correct, please try again");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    } //end of login check


}
