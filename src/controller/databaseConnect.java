package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnect {

    public static void Connection() {

        final String connectionUrl = Password.getURL();

        try {

//            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection(connectionUrl);
            System.out.println("Connected");
            //while(returnStatement.next()) {
            //System.out.println("rs.getString");
            //}

            } catch (SQLException e) {
            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}}