package view;

import controller.YesNoAlert;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Login extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Login");
        window.setOnCloseRequest(e -> {
            if (YesNoAlert.closeProgram(true)) {
                e.consume();
            }
        });

        //String doesn't need to be set at the second diamond because its emplied
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        //getItems returns the ObservableList object
        choiceBox.getItems().add("William Conniston");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        HBox hbButtons = new HBox();
        hbButtons.setSpacing(10.0);

        //Name Label
        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name Input
        TextField nameInput = new TextField();
        nameInput.setPromptText("username");
        GridPane.setConstraints(nameInput,1,0);

        //Password Label
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel,0,1);

        //Password Input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput,1,1);

        Button loginButton = new Button ("Login");
        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction(e -> {
            if(YesNoAlert.closeProgram(true)){
                e.consume();
            }


        });

        Button helpButton = new Button("Help");

        GridPane.setConstraints(cancelButton,1,2);
        GridPane.setConstraints(cancelButton,2,2);
        GridPane.setConstraints(helpButton,3,2);

        hbButtons.getChildren().addAll(loginButton, cancelButton, helpButton);
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput);
        grid.add(hbButtons, 0,2,2,1);
        Scene scene = new Scene(grid, 450, 200);
        window.setScene(scene);
        window.show();
    } // end of primaryStage
}
