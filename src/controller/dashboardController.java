package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class dashboardController {

    public void start(Stage primaryStage) throws Exception {

        Parent root;
        root = FXMLLoader.load(getClass().getClassLoader().getResource("view/dashboard.fxml"));
        Stage stage = new Stage();
        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(root, 800, 300));
        stage.show();

    }

}
