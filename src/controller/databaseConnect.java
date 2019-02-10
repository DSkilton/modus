package controller;

import java.sql.*;


public class databaseConnect {

    public static Connection getConnection() {

        Connection con = null;

        try {
            //connection
            con = DriverManager.getConnection(Password.url, Password.user, Password.password);
        } catch (SQLException e) {
            e.printStackTrace();
            //put this in to see difference between the two messages
            System.out.println("Something went wrong " + e.getMessage());
        } finally {


        }
        System.out.println("Connected to Database -> " + con);
        return con;
    }
}
