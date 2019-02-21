package controller;

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
    }

    @FXML
    private void cancelButtonAction(){
        //Platform.exit closes the entire program rather than just a scene
        if(AlertBox.display("Exit Dialogue", "Are you sure you want to exit?")){
            cancelButton.setOnAction(e -> Platform.exit());
        }
    }

    @FXML
    private void helpButtonAction(){
        helpButton.setOnAction(e -> AlertBox.display("Help", "Any issues please call your help desk on 01325 364578"));
    }

    private void loginCheck(){
        //Static details for testing. Password would be converted to SHA-256 and stored in a database for future iterations
        final String USERNAME = "admin";
        final String PASSWORD = "admin";

        //Setting u or r to values entered to username and password buttons
        String u = username.getText().toLowerCase();
        String p = password.getText().toLowerCase();

        //To check some details have been entered
        if(u.isEmpty() || (p.isEmpty())){
            AlertBox.display("Check Input", "Please check username and password");
            }

        if(u != USERNAME && p != PASSWORD){
                AlertBox.display("Incorrect Details", "Please check login details");
                } else {
                    loginButton.setOnAction(e -> {
                        //Loads the next scene and shows dashboard.fxml
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getClassLoader().getResource("view/dashboard.fxml"));
                            Scene sceneDash = new Scene(loader.load(), 800, 800);
                            Stage stageDash = new Stage();
                            stageDash.setTitle("Modus -> Dashboard");
                            stageDash.setScene(sceneDash);
                            stageDash.show();
                            } catch (IOException e1) {
                                e1.getMessage();
                          }

                        //Closes login.FXML
                        Stage stageLogin = (Stage) loginButton.getScene().getWindow();
                        stageLogin.close();
                    });
                }
                System.out.println("Login");
        }//end of login check
} //end of login controller
