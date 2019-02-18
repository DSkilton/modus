package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class loaderDashboard extends Application {

    private Stage primaryStage;
    private BorderPane rootLayour;

    public void start (Stage stage) throws Exception {
        this.primaryStage = stage;
        this.primaryStage.setTitle("Modus - Together, we can build something great");

        /* Connection needs work
        DBConn conn = DBConn.getInstance();
         */

        runLogin();

    } //end of primary stage

    public void runLogin() {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("view/login.fxml"));
            Pane rootLayout = (Pane)loader.load();
            loginController login = loader.getController();

        } catch (IOException e) {
            e.getStackTrace();
        } // end of Try Catch



    } //end of run login
}
