package sample;

import javafx.application.Application;
import view.Login;

public class Main{

        public static void main(String[] args) {
            // NEEDS WORK --- controller.databaseConnect.getConnection();

            //Because accessing from different class, the following line replaced Application.launch(args)
            Application.launch(Login.class, args);

        }//end of main
    }// end of class


