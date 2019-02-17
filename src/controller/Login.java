package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import view.AlertBox;

public class Login {
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private Button login;
    @FXML private Button cancel;
    @FXML private Button help;

    //Static details for testing. Password would be converted to SHA-256 and stored in a database for future itterations
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "admin";

    private void loginCheck() {
        try {
            String u = username.getText();
            String p = password.getText();

            if((u != USERNAME) && (p != PASSWORD)) {
                AlertBox.display("Check Login Details ", "Login details are not correct, please try again");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }



    }
}
