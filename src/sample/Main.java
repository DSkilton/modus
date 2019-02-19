package sample;

import javafx.application.Application;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root;
        root = FXMLLoader.load(getClass().getClassLoader().getResource("view/login.fxml"));
        Stage stage = new Stage();
        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(root, 800, 300));
        stage.show();

    }// end of start

        public static void main(String[] args) {
            // NEEDS WORK --- controller.databaseConnect.getConnection();

            Application.launch(Main.class, args);
        }//end of main
    }// end of class


