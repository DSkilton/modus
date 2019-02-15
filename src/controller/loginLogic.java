package controller;

import view.AlertBox;
import view.Login;

import java.awt.peer.SystemTrayPeer;

public class loginLogic {

    static String u = Login.class.getName();
    static String p = null; //Login.class.getPassword();

    public static final String USERNAME = "admin";
    public static final String PASSWORD = "admin";

    public static boolean loginCheck (boolean login) {

        //logic to check user details. Password would be converted to SHA-256 and stored in a database for future itterations
        if((u != USERNAME) && (p != PASSWORD)) {
            AlertBox.display("Check Login Details ", "Login details are not correct, please try again");
            return false;
        }

        return login;
    }
}
