package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }//end of main

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Checkbox Demo");
        Button button1 = new Button("Login");
        Button button2 = new Button("Help");

        //String doesn't need to be set at the second diamond because its emplied
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().add("William Conniston");

        //getItems returns the ObservableList object
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name Label
        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name Input
        TextField nameInput = new TextField("Username");
        GridPane.setConstraints(nameInput,1,0);

        //Password Label
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel,1,1);

        //Password Input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput,1,2);

        Button loginButton = new Button ("Login");
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
        Scene scene = new Scene(grid, 300, 200);

        window.show();
    } // end of primaryStage

}
// end of class


