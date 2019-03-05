package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnect {

    public static void Connection() {

        final String connectionUrl = Password.getURL();

        try {

            Connection con = DriverManager.getConnection(connectionUrl);
            System.out.println("Connected");

            } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}