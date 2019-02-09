package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class alertBox {

    static boolean answer;

    public static void alertBox(String title, String message){

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
        });

        noButton.setOnAction(e -> {
            answer = false;
            alertWindow.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(messageLabel);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        alertWindow.setScene(scene);
        alertWindow.showAndWait();
    }

}
