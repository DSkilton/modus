package view;

import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.*;

public class AlertBox {

    static boolean answer;

    public static boolean display(String title, String message){
        System.out.println("answer before yes or no " + answer);
        Stage AlertBox = new Stage();
        AlertBox.initModality(Modality.APPLICATION_MODAL);
        AlertBox.setTitle(title); // title from method
        AlertBox.setMinWidth(250);
        Label messageLabel = new Label();
        messageLabel.setText(message); //message from method

        //create two buttons
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
            answer = true;
            AlertBox.close();
            System.out.println("set on action -> yes " + answer);

        });

        noButton.setOnAction(e -> {
            answer = false;
            AlertBox.close();
            System.out.println("set on action -> no " + answer);
        });

        HBox layout = new HBox(10);
        layout.getChildren().addAll(messageLabel, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        AlertBox.setScene(scene);
        AlertBox.showAndWait();

        return answer;
    }

}
