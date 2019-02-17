package sample;

import javafx.application.Application;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
    private Stage primaryStage;
    private BorderPane mainLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("FXML Welcome");
        showInView();
    }

    private void showInView() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/login.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // NEEDS WORK --- controller.databaseConnect.getConnection();
        Preloader.launch(Main.class, args);
        Application.launch(Main.class, args);

    }//end of main
}// end of class


