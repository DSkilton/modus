package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root;
        root = FXMLLoader.load(getClass().getClassLoader().getResource("view/login.fxml"));
        Stage stageLogin = new Stage();
        stageLogin.setTitle("FXML Welcome");
        stageLogin.setScene(new Scene(root, 800, 300));
        stageLogin.show();

    }// end of start

        public static void main(String[] args) {
            // NEEDS WORK --- controller.databaseConnect.getConnection();

            Application.launch(Main.class, args);
        }//end of main
    }// end of class


