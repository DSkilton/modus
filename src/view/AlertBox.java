package view;

import controller.YesNoAlert;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.*;

public class AlertBox {

    static boolean answer;

    public static boolean display(String title, String message){
        System.out.println("answer before yes or now " + answer);
        Stage alertWindow = new Stage();
        alertWindow.initModality(Modality.APPLICATION_MODAL);
        alertWindow.setTitle(title); // title from method
        alertWindow.setMinWidth(250);
        Label messageLabel = new Label();
        messageLabel.setText(message); //message from method

        //create two buttons
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
            answer = true;
            alertWindow.close();
            System.out.println("set on action -> yes " + answer);

        });

        noButton.setOnAction(e -> {
            answer = false;
            alertWindow.close();
            System.out.println("set on action -> no " + answer);
        });

        HBox layout = new HBox(10);
        layout.getChildren().addAll(messageLabel, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        alertWindow.setScene(scene);
        alertWindow.showAndWait();

        return answer;
    }

}
